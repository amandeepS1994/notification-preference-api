package com.abidevel.notification.notificationpreferenceservice.repository;


import java.util.Optional;

import com.abidevel.notification.notificationpreferenceservice.model.entities.NotificationPreference;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationServiceRepository extends JpaRepository<NotificationPreference, Long> {

    Optional<NotificationPreference> findById (Long customerId);

    Optional<NotificationPreference> findByCustomerId (Long customerId);

}
