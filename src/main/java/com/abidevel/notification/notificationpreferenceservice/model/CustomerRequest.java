package com.abidevel.notification.notificationpreferenceservice.model;

import lombok.Data;

@Data
public class CustomerRequest {
    private long customerId;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
}
