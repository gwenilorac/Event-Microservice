package com.gwenilorac.eventsmicroservice.repositories;

import com.gwenilorac.eventsmicroservice.domain.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}