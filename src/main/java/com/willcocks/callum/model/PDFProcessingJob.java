package com.willcocks.callum.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class PDFProcessingJob extends PDFExtractionRequest{
    @JsonProperty("total_pages")
    private int totalPages;

    public PDFProcessingJob(int totalPages) {
        this.totalPages = totalPages;
    }

    public PDFProcessingJob() {
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
