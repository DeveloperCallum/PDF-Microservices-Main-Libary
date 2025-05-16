package com.willcocks.callum.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.willcocks.callum.model.data.Selection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonPropertyOrder(value = {"selection", "pdf_document"})
public class PDFExtractionRequest implements Serializable {
    @JsonProperty("pdf_document")
    private String pdfDocument;
    private Map<Integer, List<Selection>> selection = new HashMap<>();

    private String callbackURL;

    public PDFExtractionRequest() {
    }

    public String getPdfBase64Document() {
        return pdfDocument;
    }

    public void setPdfDocument(String pdfDocument) {
        this.pdfDocument = pdfDocument;
    }

    public Map<Integer, List<Selection>> getSelection() {
        return selection;
    }

    public void setSelection(Map<Integer, List<Selection>> selection) {
        this.selection = selection;
    }

    public PDFExtractionRequest(String callbackURL) {
        this.callbackURL = callbackURL;
    }
}
