package org.example.esgproject.dto;

public class SpendingDTO {
    private String category;
    private  int amount;

    public SpendingDTO() {}

    public SpendingDTO(String category, int amount){
        this.category = category;
        this.amount = amount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return this.category;
    }

    public int getAmount() {
        return  this.amount;
    }
}
