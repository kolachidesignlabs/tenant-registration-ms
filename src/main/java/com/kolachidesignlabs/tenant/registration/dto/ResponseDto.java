package com.kolachidesignlabs.tenant.registration.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {

    private String statusCode;
    private String message;
    private Object data;
    private Object pagination;

}
