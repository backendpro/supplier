package com.umbrella.supplier.model.request;

public class ContactRequest {

    private String email;

    private Long phoneNumber;

    private Long cellPhone;

    private Long sacNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(Long cellPhone) {
        this.cellPhone = cellPhone;
    }

    public Long getSacNumber() {
        return sacNumber;
    }

    public void setSacNumber(Long sacNumber) {
        this.sacNumber = sacNumber;
    }
}
