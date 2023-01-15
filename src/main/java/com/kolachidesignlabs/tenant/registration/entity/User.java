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
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "USER_NAME", nullable = false, length = 100)
    private String userName;

    @Email
    @Column(name = "EMAIL", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "PASSWORD", nullable = false, length = 500)
    private String password;

    @ManyToOne
    @JoinColumn(name = "USER_TYPE_ID", nullable = false)
    private UserType userType;

    @ManyToOne
    @JoinColumn(name = "USER_ROLE_ID", nullable = false)
    private UserRole userRole;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID", nullable = false)
    private Company company;
}
