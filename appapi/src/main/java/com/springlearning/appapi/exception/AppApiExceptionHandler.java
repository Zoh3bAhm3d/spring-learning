package com.springlearning.appapi.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppApiExceptionHandler  extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { Exception.class })
    protected ResponseEntity<Object> handleConflict(Exception ex, WebRequest request) {
    	
        String bodyOfResponse = "This should be application specific";
        
        ExceptionResponse responseException = new ExceptionResponse();
        responseException.setException(ex.getMessage());
        responseException.setMessage(bodyOfResponse);
        
        
        return handleExceptionInternal(ex, responseException, new HttpHeaders(), HttpStatus.CONFLICT, request);
    }
	
}
