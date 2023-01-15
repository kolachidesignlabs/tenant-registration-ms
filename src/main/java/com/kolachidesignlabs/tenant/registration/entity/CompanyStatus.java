package com.kolachidesignlabs.tenant.registration.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COMPANY_STATUSES")
public class CompanyStatus {

    public CompanyStatus(Long companyStatusId) {
        this.companyStatusId = companyStatusId;
    }

    @Id
    @Column(name = "COMPANY_STATUS_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyStatusId;

    @Column(name = "COMPANY_STATUS", nullable = false, unique = true, length = 100)
    private String companyStatus;

}
