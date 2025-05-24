package com.willcocks.callum.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.willcocks.callum.model.data.Selection;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonPropertyOrder(value = {"pdfBase64", "selection"})
public class PDFExtractionRequest implements Serializable {
    @JsonProperty("pdfBase64")
    private String pdfBase64Document;
    private Map<Integer, List<Selection>> selection = new HashMap<>();

    public PDFExtractionRequest() {
    }

    public String getPdfBase64Document() {
        return pdfBase64Document;
    }

    public void setPdfBase64Document(String pdfBase64Document) {
        this.pdfBase64Document = pdfBase64Document;
    }

    public Map<Integer, List<Selection>> getSelection() {
        return selection;
    }

    public void setSelection(Map<Integer, List<Selection>> selection) {
        this.selection = selection;
    }
}
