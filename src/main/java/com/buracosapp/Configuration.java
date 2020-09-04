package com.buracosapp;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableGlobalMethodSecurity(prePostEnabled = true)  
@org.springframework.context.annotation.Configuration
public class Configuration {

	
    protected void configure(final HttpSecurity http) throws Exception {}  

	/*
	 * @Component public class CorsFilter extends OncePerRequestFilter {
	 * 
	 * 
	 * @Override protected void doFilterInternal(final HttpServletRequest request,
	 * final HttpServletResponse response, final FilterChain filterChain) throws
	 * ServletException, IOException {
	 * response.addHeader("Access-Control-Allow-Origin", "*");
	 * response.addHeader("Access-Control-Allow-Methods",
	 * "GET, POST, DELETE, PUT, PATCH, HEAD");
	 * response.addHeader("Access-Control-Allow-Headers",
	 * "Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers"
	 * ); response.addHeader("Access-Control-Expose-Headers",
	 * "Access-Control-Allow-Origin, Access-Control-Allow-Credentials");
	 * response.addHeader("Access-Control-Allow-Credentials", "true");
	 * response.addIntHeader("Access-Control-Max-Age", 10);
	 * filterChain.doFilter(request, response); } }
	 */
    
    public class WebConfiguration implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedMethods("*");
        }
    }
}
