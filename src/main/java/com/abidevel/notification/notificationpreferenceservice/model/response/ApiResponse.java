package com.abidevel.notification.notificationpreferenceservice.model.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse <T> {
    private boolean status;
    private String message;
    private LocalDateTime timeOfResponse;
    private T data;

    public ApiResponse (boolean status, String message) {
        this.status = status;
        this.message = message;
        this.timeOfResponse = LocalDateTime.now();
    }

    public ApiResponse (boolean status, T data) {
        this.status = status;
        this.data = data;
        this.timeOfResponse = LocalDateTime.now();
    }


    public boolean isStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeOfResponse() {
        return this.timeOfResponse;
    }

    public void setTimeOfResponse(LocalDateTime timeOfResponse) {
        this.timeOfResponse = timeOfResponse;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
    
}
