package org.example.esgproject.dto;

import java.util.Map;

public class CategoryAnalysisResponse {
    private int totalAmount;
    private Map<String, Integer> categorySummary;
    private Map<String, String> categoryRatio;
    private String insight;

    public CategoryAnalysisResponse(int totalAmount, Map<String, Integer> categorySummary, Map<String, String> categoryRatio, String insight) {
        this.totalAmount = totalAmount;
        this.categorySummary = categorySummary;
        this.categoryRatio = categoryRatio;
        this.insight=insight;
    }

    public int getTotalAmount(){return totalAmount;}
    public Map<String, Integer> getCategorySummary() {return categorySummary;}
    public Map<String, String> getCategoryRatio() {return categoryRatio;}
    public String getInsight() {return insight;}
}
