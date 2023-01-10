package com.saas.registeration.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    private String completeName;

    @Column(name = "COMMERCIAL_NAME")
    @NotNull
    private String commercialName;

    @Column(name = "LANDLINE_NUMBER")
    @NotNull
    private String landlineNumber;

    @Column(name = "ADDRESS")
    @NotNull
    private String address;

    @Column(name = "STRN")
    @NotNull
    private String strn;

    @Column(name = "REGISTRATION_NUMBER")
    @NotNull
    private String registrationNumber;

    @Column(name = "TAX_REGISTRATION_NUMBER")
    @NotNull
    private String taxRegistrationNumber;

    @Column(name = "EMAIL")
    @NotNull
    private String email;

}
