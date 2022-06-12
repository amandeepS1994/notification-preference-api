package com.abidevel.notification.notificationpreferenceservice.model.dto;




public class NotificationPreferenceDTO {
    
    private Long id;
    private Long customerId;
    private boolean smsPreferenceFlag;
    private boolean emailPreferenceFlag;
    private String phoneNumber;
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
