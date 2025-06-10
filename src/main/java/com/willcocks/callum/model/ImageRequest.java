package com.willcocks.callum.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.UUID;

/**
 * An object that stores the request incoming from the web controller.
 */
public class ImageRequest implements Serializable {
    private UUID documentUUID;
    private String Base64Document;

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
        return Base64Document;
    }

    public void setBase64Document(String base64Document) {
        Base64Document = base64Document;
    }
}
