package com.lancefallon.restapidemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> notImplementedExceptionHandler(Exception e) {
        Map<String, String> response = new HashMap<>();
        response.put("error", "Your request could not be completed + " + e.toString());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
