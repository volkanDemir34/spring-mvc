package com.mvc.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.mvc.component.CustomLogoutSuccessHandler;

@Configuration
@EnableWebSecurity // (debug=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	@Qualifier("myUserDetailService")
	UserDetailsService userDetailsService;

	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception {
	 * auth.inMemoryAuthentication().passwordEncoder(passwordEncoder).withUser(
	 * "user")
	 * .password(passwordEncoder.encode("123456")).roles("USER").and().withUser(
	 * "admin") .password(passwordEncoder.encode("123456")).roles("ADMIN"); }
	 */

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.authorizeRequests().antMatchers("/admin**").access(
	 * "hasRole('ROLE_ADMIN')").antMatchers("/admin/**")
	 * .access("hasRole('ROLE_ADMIN')").antMatchers("/homePage").authenticated()
	 * .antMatchers(HttpMethod.GET, "/goster**").access("hasRole('ROLE_USER')")
	 * .antMatchers(HttpMethod.GET,
	 * "/goster/**").access("hasRole('ROLE_USER')").and().formLogin()
	 * .loginPage("/login").failureUrl("/login?error").loginProcessingUrl(
	 * "/j_spring_security_check")
	 * .usernameParameter("username").passwordParameter("password").and().logout()
	 * .logoutSuccessUrl("/login?logout").and().csrf();
	 * 
	 * }
	 */

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')").antMatchers("/admin**")
				.access("hasRole('ROLE_ADMIN')").and().formLogin().loginPage("/login").failureUrl("/login?error")
				.usernameParameter("username").passwordParameter("password").and().logout()
				.logoutSuccessHandler(new CustomLogoutSuccessHandler()).invalidateHttpSession(true)
				.deleteCookies("JSESSIONID")
				.and().exceptionHandling().accessDeniedPage("/403").and().csrf().disable();
	};

	@Bean
	public AuthenticationManager customAuthenticationManager() throws Exception {
		return authenticationManager();
	}
}
