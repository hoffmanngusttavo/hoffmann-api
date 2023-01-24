package br.com.hoffmann.controller.exception;

import br.com.hoffmann.service.exception.EntityNotFoundException;
import br.com.hoffmann.service.exception.ServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<StandardError> entityNotFound(EntityNotFoundException exception, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new StandardError.StandardErrorBuilder()
                        .timestamp(Instant.now())
                        .status(HttpStatus.NOT_FOUND.value())
                        .error("Resource not found")
                        .message(exception.getMessage())
                        .path(request.getRequestURI())
                        .build());

    }

    @ExceptionHandler({ServiceException.class, Exception.class})
    public ResponseEntity<StandardError> internalError(EntityNotFoundException exception, HttpServletRequest request){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new StandardError.StandardErrorBuilder()
                        .timestamp(Instant.now())
                        .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                        .error("Ocorreu alguma falha ao processar requisição interna no servidor")
                        .message(exception.getMessage())
                        .path(request.getRequestURI())
                        .build());

    }



}
