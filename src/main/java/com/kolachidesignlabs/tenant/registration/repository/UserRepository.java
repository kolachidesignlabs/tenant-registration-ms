package com.kolachidesignlabs.tenant.registration.repository;

import com.kolachidesignlabs.tenant.registration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
