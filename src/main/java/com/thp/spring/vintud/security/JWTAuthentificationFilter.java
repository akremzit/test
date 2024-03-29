package com.thp.spring.vintud.security;

import java.io.IOException;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.thp.spring.vintud.entity.UserEntity;
import com.thp.spring.vintud.model.UserDetail;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTAuthentificationFilter extends UsernamePasswordAuthenticationFilter {

	private AuthenticationManager authenticationManager;

	public JWTAuthentificationFilter(AuthenticationManager authenticationManager) {
		super();
		this.authenticationManager = authenticationManager;
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		UserEntity user = null;
		try {
			user = new UserEntity(request.getParameter("username"), request.getParameter("password"));
		} catch (Exception exp) {
			throw new RuntimeException(exp);
		}

		return authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getPseudo(), user.getMotDePasse()));
	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		System.out.println("***************************");
		System.out.println(authResult.getPrincipal());
		User springUser = (User) authResult.getPrincipal();
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		requestURI = requestURI.substring(contextPath.length());
		setAuthenticationSuccessHandler(new SimpleUrlAuthenticationSuccessHandler(requestURI));

		String jwt = Jwts.builder().setSubject(springUser.getUsername())
				.setExpiration(new Date(System.currentTimeMillis() + JwtProperties.EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS256, JwtProperties.SECRET).claim("roles", springUser.getAuthorities())
				.compact();
		System.out.println("JWT TOKEN : " + jwt);
		response.addHeader(JwtProperties.HEADER_STRING, JwtProperties.TOKEN_PREFIX + jwt);

	}
}
