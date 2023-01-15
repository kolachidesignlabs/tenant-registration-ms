package com.kolachidesignlabs.tenant.registration.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_TYPES")
public class UserType {

    public UserType(Long userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Id
    @Column(name = "USER_TYPE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userTypeId;

    @Column(name = "USER_TYPE", nullable = false, unique = true, length = 100)
    private String userType;

}
