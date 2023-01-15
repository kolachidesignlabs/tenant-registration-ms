package com.saas.registeration.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COMPANY_STATUS")
public class CompanyStatus extends BaseEntity {

    public CompanyStatus(Long companyStatusId) {
        this.companyStatusId = companyStatusId;
    }

    @Id
    @Column(name = "COMPANY_STATUS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyStatusId;

    @Column(name = "COMPANY_STATUS")
    private String companyStatus;

}
