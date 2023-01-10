package com.saas.registeration.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {

    private String statusCode;
    private String message;
    private Object data;
    private Object pagination;

}
