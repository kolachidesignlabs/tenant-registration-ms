package com.saas.registeration.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER")
public class User extends BaseEntity {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @ManyToOne
    @JoinColumn(name = "USER_TYPE_ID")
    private UserType userType;

    @ManyToOne
    @JoinColumn(name = "USER_ROLE_ID")
    private UserRole userRole;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Company company;
}
