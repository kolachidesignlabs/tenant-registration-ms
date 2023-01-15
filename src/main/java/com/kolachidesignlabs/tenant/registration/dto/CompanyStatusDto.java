package com.kolachidesignlabs.tenant.registration.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompanyStatusDto {
    Long companyId;
    Long companyStatusId;
    Long companyStatus;
}
