package com.umbrella.supplier.model.request;

public class SupplierRequest {

    private String fantasyName;

    private String formalName;

    private String document;

    private String stateDocumentId;

    private AddressRequest addressRequest;

    private ContactRequest contactRequest;

    public String getFantasyName() {
        return fantasyName;
    }

    public void setFantasyName(String fantasyName) {
        this.fantasyName = fantasyName;
    }

    public String getFormalName() {
        return formalName;
    }

    public void setFormalName(String formalName) {
        this.formalName = formalName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getStateDocumentId() {
        return stateDocumentId;
    }

    public void setStateDocumentId(String stateDocumentId) {
        this.stateDocumentId = stateDocumentId;
    }

    public AddressRequest getAddressRequest() {
        return addressRequest;
    }

    public void setAddressRequest(AddressRequest addressRequest) {
        this.addressRequest = addressRequest;
    }

    public ContactRequest getContactRequest() {
        return contactRequest;
    }

    public void setContactRequest(ContactRequest contactRequest) {
        this.contactRequest = contactRequest;
    }
}
