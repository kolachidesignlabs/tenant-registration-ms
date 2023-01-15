package com.kolachidesignlabs.tenant.registration.repository;

import com.kolachidesignlabs.tenant.registration.entity.CompanySubscriptionPlanHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanySubscriptionPlanHistoryRepository extends JpaRepository<CompanySubscriptionPlanHistory, Long> {
}
