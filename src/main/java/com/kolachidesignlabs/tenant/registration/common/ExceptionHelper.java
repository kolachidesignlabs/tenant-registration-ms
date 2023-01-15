package com.kolachidesignlabs.tenant.registration.common;

import com.kolachidesignlabs.tenant.registration.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.*;

@ControllerAdvice
@Slf4j
public class ExceptionHelper {

    @ExceptionHandler(value = {ResponseStatusException.class})
    public ResponseEntity<ResponseDto> handleException(ResponseStatusException ex) {
        log.debug("Exception: " + ex.getMessage());
        return new ResponseEntity<>(new ResponseDto(ex.getStatus(), ex.getReason()), ex.getStatus());
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ResponseDto> handleException(Exception ex) {
        log.error("Exception: " + ex);
        ex.printStackTrace();
        return new ResponseEntity<>(new ResponseDto(INTERNAL_SERVER_ERROR, ex.getMessage()), INTERNAL_SERVER_ERROR);
    }
}