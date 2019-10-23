package com.thp.spring.vintud.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.thp.spring.vintud.repository.UserRepository;
import com.thp.spring.vintud.service.Impl.AppUserDetailsService;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	private AppUserDetailsService userDetailsService;
    private UserRepository userRepository;
    

	public SecurityConfig(AppUserDetailsService userDetailsService, UserRepository userRepository) {
		super();
		this.userDetailsService = userDetailsService;
		this.userRepository = userRepository;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
		

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		// remove csrf and state in session because in jwt we do not need them
        .csrf().disable()
      .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        .and()
        // add jwt filters (1. authentication, 2. authorization)
        .addFilter(new JWTAuthentificationFilter(authenticationManager()))
        .addFilter(new JwtAuthorizationFilter(authenticationManager(),  this.userRepository))
        .authorizeRequests()
		 	.antMatchers("/","/index.html","/app/**","/assets/**","/environments/**").permitAll()
         	.anyRequest().authenticated()
		 .and()
		 	.formLogin()
		 		.permitAll()
		 .and()
			.logout()
        		.logoutUrl("/logout")
        	//.deleteCookies("JSESSIONID")
        		.permitAll();
//        		.and()
//        			.httpBasic();
        				
		
	}
	
}
