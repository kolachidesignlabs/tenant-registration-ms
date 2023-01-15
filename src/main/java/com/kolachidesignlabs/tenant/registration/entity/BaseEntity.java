package com.kolachidesignlabs.tenant.registration.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DATETIME", nullable = false, length = 19, updatable = false)
    @CreatedDate
    private Date createDatetime;

    @Column(name = "CREATED_BY", nullable = false, updatable = false)
    private Long createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MODIFIED_DATETIME", nullable = false, length = 19)
    @LastModifiedDate
    private Date modifiedDatetime;

    @Column(name = "MODIFIED_BY", nullable = false)
    private Long modifiedBy;
}

