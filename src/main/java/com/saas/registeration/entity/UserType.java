package com.saas.registeration.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_TYPE")
public class UserType extends BaseEntity {

    public UserType(Long userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Id
    @Column(name = "USER_TYPE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userTypeId;

    @Column(name = "USER_TYPE")
    private String userType;

}
