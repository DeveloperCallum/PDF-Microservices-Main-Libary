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
    private String base64Document;
    private Map<Integer, List<Selection>> selection = new HashMap<>();

    public PDFExtractionRequest() {
    }

    public String getBase64Document() {
        return base64Document;
    }

    public void setBase64Document(String base64Document) {
        this.base64Document = base64Document;
    }

    public Map<Integer, List<Selection>> getSelection() {
        return selection;
    }

    public void setSelection(Map<Integer, List<Selection>> selection) {
        this.selection = selection;
    }
}
