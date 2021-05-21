package com.project.workout.exceptionHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.workout.vo.ResponseVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("com.project.workout.controller")
public class WorkoutExceptionHandler {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handle(MethodArgumentNotValidException e) throws JsonProcessingException {
        String result = objectMapper.writeValueAsString(new ResponseVO(HttpStatus.BAD_REQUEST.value(), null, "請求錯誤"));
        return new ResponseEntity<String>(result, HttpStatus.BAD_REQUEST);
    }
}


