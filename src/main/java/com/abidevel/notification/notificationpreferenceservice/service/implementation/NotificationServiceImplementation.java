package com.abidevel.notification.notificationpreferenceservice.service.implementation;

import java.util.Optional;

import com.abidevel.notification.notificationpreferenceservice.model.entities.NotificationPreference;
import com.abidevel.notification.notificationpreferenceservice.repository.NotificationServiceRepository;
import com.abidevel.notification.notificationpreferenceservice.service.NotificationService;

import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImplementation implements NotificationService {

    private final NotificationServiceRepository notificationServiceRepository;

    public NotificationServiceImplementation (NotificationServiceRepository notificationRepo) {
        this.notificationServiceRepository = notificationRepo;
    }

    @Override
    public Optional<NotificationPreference> retrieveCustomerPreference(Long customerId) {
        return notificationServiceRepository.findByCustomerId(customerId);
    }
    
}
