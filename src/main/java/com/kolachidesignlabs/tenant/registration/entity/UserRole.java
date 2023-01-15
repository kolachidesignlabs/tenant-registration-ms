package com.kolachidesignlabs.tenant.registration.entity;

import javax.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_ROLES")
public class UserRole {

    public UserRole(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Id
    @Column(name = "USER_ROLE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRoleId;

    @Column(name = "USER_ROLE", nullable = false, length = 100, unique = true)
    private String userRole;

}
