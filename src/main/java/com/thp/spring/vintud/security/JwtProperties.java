package com.thp.spring.vintud.security;

public class JwtProperties {
	private JwtProperties() {
	}

	public static final String SECRET = "vintud@talan.com";
	public static final long EXPIRATION_TIME = 864000000;// 10 jours
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";

}
