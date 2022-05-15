package com.abidevel.notification.notificationpreferenceservice.service;

import java.util.Optional;

import com.abidevel.notification.notificationpreferenceservice.model.entities.NotificationPreference;

public interface NotificationService {
    Optional<NotificationPreference> retrieveCustomerPreference (Long customerId);
}
