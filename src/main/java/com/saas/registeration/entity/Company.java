package com.saas.registeration.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COMPANY")
public class Company extends BaseEntity {

    @Id
    @Column(name = "COMPANY_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column(name = "COMPLETE_NAME")
    private String completeName;

    @Column(name = "COMMERCIAL_NAME")
    private String commercialName;

    @Column(name = "LANDLINE_NUMBER")
    private String landlineNumber;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "STRN")
    private String strn;

    @Column(name = "REGISTRATION_NUMBER")
    private String registrationNumber;

    @Column(name = "TAX_REGISTRATION_NUMBER")
    private String taxRegistrationNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DOMAIN_URL")
    private String domainUrl;

}
