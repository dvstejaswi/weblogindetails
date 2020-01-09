package org.cap.config;

import javax.servlet.http.HttpServletRequest;

import org.cap.entities.AppUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("org.cap")
public class MyWebMVCConfig {

	@Bean
public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	/*
@Scope(value = "session",proxyMode= ScopedProxyMode.TARGET_CLASS)
	public AppUser appUser(HttpServletRequest request) {
		return new AppUser();
	}*/
	
}
