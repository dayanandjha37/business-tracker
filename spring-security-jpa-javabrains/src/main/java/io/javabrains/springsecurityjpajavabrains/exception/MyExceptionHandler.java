package io.javabrains.springsecurityjpajavabrains.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {

	
	@ExceptionHandler(value = Exception.class)
	public String globalExceptionHandler() {
		
		return "null_page";
	}
}
