package com.mvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import com.mvc.component.JwtTokenProvider;
import com.mvc.service.MvcService;
import com.volkan.model.Request;


@RestController
public class MvcController {
	

	@Autowired
	MvcService service;

	@Autowired
	private AuthenticationManager authenticationManager;

	/*@Autowired
	JwtTokenProvider tokenProvider;*/

	@GetMapping(value = "/insert")
	public void insert(HttpServletRequest request) {
		request.getSession().setAttribute("demir", "volkan");
		service.insert();
	}

	@PostMapping(value = "/authenticate")
	public ResponseEntity<?> createToken(@RequestBody Request request , HttpServletResponse response, HttpServletRequest req) {

		// Burada authenticationa sokuluyor
		
		System.out.println(req.getSession().getAttribute("ad"));
		SecurityContextHolder.getContext().getAuthentication();

		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
	String jwt ="";//= tokenProvider.generateToken(authentication);
		Cookie cookie = new Cookie("ad", "Volkan");
		cookie.setHttpOnly(true);
		response.addCookie(cookie);
		HttpSession session = req.getSession();
		session.setAttribute("ad", "value");
		

		return ResponseEntity.ok(jwt);
	}

}
