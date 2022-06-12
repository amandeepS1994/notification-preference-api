package com.abidevel.notification.notificationpreferenceservice.controller;

import java.util.Optional;

import com.abidevel.notification.notificationpreferenceservice.model.entities.NotificationPreference;
import com.abidevel.notification.notificationpreferenceservice.model.response.ApiResponse;
import com.abidevel.notification.notificationpreferenceservice.service.NotificationService;
import com.abidevel.notification.notificationpreferenceservice.utility.ObjectMapperUtil;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "notification/", produces = MediaType.APPLICATION_JSON_VALUE)
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController (NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping(path = "{customerId}/preferences/")
    public ResponseEntity<ApiResponse<NotificationPreference>>retrievePreferenceInformation(@PathVariable long customerId) {
            Optional<NotificationPreference> notification = notificationService.retrieveCustomerPreference(customerId);
            if (notification.isPresent()) {
                return new ResponseEntity<>(new ApiResponse<>(true,  ObjectMapperUtil.mapEntity(notification.get(), NotificationPreference.class)), HttpStatus.ACCEPTED);
            }

            return new ResponseEntity<>(new ApiResponse<>(false, "Customer Not Found"), HttpStatus.NOT_FOUND);
        

    }

  
    
}
