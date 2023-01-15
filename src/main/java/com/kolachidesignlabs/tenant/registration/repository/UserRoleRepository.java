package com.kolachidesignlabs.tenant.registration.repository;

import com.kolachidesignlabs.tenant.registration.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

}
