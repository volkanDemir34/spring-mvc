package com.mvc.filter;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter {

	private AuthenticationManager authenticationManager;

	
	public JwtAuthorizationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}

}
