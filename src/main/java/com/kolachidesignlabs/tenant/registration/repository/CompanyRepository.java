package com.kolachidesignlabs.tenant.registration.repository;

import com.kolachidesignlabs.tenant.registration.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
