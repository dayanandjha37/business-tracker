package io.javabrains.springsecurityjpajavabrains.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.javabrains.springsecurityjpajavabrains.myInterceptor.InterceptorGlobal;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(new InterceptorGlobal()).addPathPatterns("/product/upload");
	}
	
	

}
