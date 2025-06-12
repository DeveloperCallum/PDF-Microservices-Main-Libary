package com.willcocks.callum.model;

import java.io.Serializable;
import java.util.UUID;

/**
 * An object that stores the request incoming from the web controller.
 */
public class ImageRequest implements Serializable {
    private UUID documentUUID;
    private String base64Document;

    private String callbackURL;

    private String callbackService;

    public ImageRequest() {
    }

    public UUID getDocumentUUID() {
        return documentUUID;
    }

    public void setDocumentUUID(UUID documentUUID) {
        this.documentUUID = documentUUID;
    }

    public String getBase64Document() {
        return base64Document;
    }

    public void setBase64Document(String base64Document) {
        this.base64Document = base64Document;
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
