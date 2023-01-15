package com.kolachidesignlabs.tenant.registration.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COMPANIES")
public class Company {

    @Id
    @Column(name = "COMPANY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column(name = "COMPLETE_NAME", unique = true, nullable = false, length = 100)
    private String completeName;

    @Column(name = "COMMERCIAL_NAME", unique = true, nullable = false, length = 100)
    private String commercialName;

    @Column(name = "LANDLINE_NUMBER", length = 30)
    private String landlineNumber;

    @Column(name = "ADDRESS", nullable = false, length = 1000)
    private String address;

    @Column(name = "STRN", length = 100)
    private String strn;

    @Column(name = "REGISTRATION_NUMBER", length = 100)
    private String registrationNumber;

    @Column(name = "TAX_REGISTRATION_NUMBER", length = 100)
    private String taxRegistrationNumber;

    @Email
    @Column(name = "EMAIL", unique = true, nullable = false, length = 100)
    private String email;

    @Column(name = "DOMAIN_URL", unique = true, nullable = false, length = 200)
    private String domainUrl;

    @ManyToOne
    @JoinColumn(name = "COMPANY_STATUS_ID", unique = true, nullable = false)
    CompanyStatus companyStatus;
}
