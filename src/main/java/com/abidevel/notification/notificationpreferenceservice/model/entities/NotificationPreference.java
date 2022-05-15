package com.abidevel.notification.notificationpreferenceservice.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "notification_preferences")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NotificationPreference {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "customerId")
    private Long customerId;
    @Column(name = "smsPreferenceFlag")
    private boolean smsPreferenceFlag;
    @Column(name = "emailPreferenceFlag")
    private boolean emailPreferenceFlag;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "emailAddress")
    private String emailAddress;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public boolean isSmsPreferenceFlag() {
        return this.smsPreferenceFlag;
    }

    public boolean getSmsPreferenceFlag() {
        return this.smsPreferenceFlag;
    }

    public void setSmsPreferenceFlag(boolean smsPreferenceFlag) {
        this.smsPreferenceFlag = smsPreferenceFlag;
    }

    public boolean isEmailPreferenceFlag() {
        return this.emailPreferenceFlag;
    }

    public boolean getEmailPreferenceFlag() {
        return this.emailPreferenceFlag;
    }

    public void setEmailPreferenceFlag(boolean emailPreferenceFlag) {
        this.emailPreferenceFlag = emailPreferenceFlag;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
