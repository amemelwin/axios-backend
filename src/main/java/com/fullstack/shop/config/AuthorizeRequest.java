package com.fullstack.shop.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;

public class AuthorizeRequest {
	static void configureAuthorizeRequests(
			AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry request) {
			request.requestMatchers(HttpMethod.POST, "/api/v1/login", "/api/v1/register").permitAll()
				.requestMatchers("/api/v1/admin/**").hasAnyAuthority("1")
				.requestMatchers("/pub/**").permitAll()
				.requestMatchers("/api/v1/user/**").hasAnyAuthority("2");
	}
}
