package com.kolachidesignlabs.tenant.registration.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {

    private int statusCode;
    private String message;
    private Object data;
    private Object pagination;

    public ResponseDto(HttpStatus statusCode, Object data) {
        this.statusCode = statusCode.value();
        this.message = statusCode.getReasonPhrase();
        this.data = data;
    }

    public ResponseDto(Object data) {
        this.statusCode = HttpStatus.OK.value();
        this.message = HttpStatus.OK.getReasonPhrase();
        this.data = data;
    }
}
