package com.saas.registeration.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_ROLE")
public class UserRole extends BaseEntity {

    public UserRole(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Id
    @Column(name = "USER_ROLE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userRoleId;

    @Column(name = "USER_ROLE")
    private String userRole;

}
