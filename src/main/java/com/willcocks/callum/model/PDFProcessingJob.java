package com.willcocks.callum.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.UUID;

@JsonPropertyOrder(value = {"documentUUID", "pdfBase64", "selection"})
public class PDFProcessingJob extends PDFExtractionRequest{
    private UUID documentUUID = UUID.randomUUID();
    private UUID selectionUUID = UUID.randomUUID();

    @JsonProperty("callbackURL")
    private String callbackURL;

    @JsonProperty("callbackService")
    private String callbackService;
    public PDFProcessingJob() {
    }

    public UUID getDocumentUUID() {
        return documentUUID;
    }

    public void setDocumentUUID(UUID documentUUID) {
        this.documentUUID = documentUUID;
    }

    public UUID getSelectionUUID() {
        return selectionUUID;
    }

    public void setSelectionUUID(UUID selectionUUID) {
        this.selectionUUID = selectionUUID;
    }

    public String getCallbackURL() {
        return callbackURL;
    }

    public void setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
    }

    public String getCallbackService() {
        return callbackService;
    }

    public void setCallbackService(String callbackService) {
        this.callbackService = callbackService;
    }
}
