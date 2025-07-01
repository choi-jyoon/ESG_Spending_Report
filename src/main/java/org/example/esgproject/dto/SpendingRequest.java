package org.example.esgproject.dto;

import java.util.List;

public class SpendingRequest {
    private List<SpendingDTO> spendinglist;

    public List<SpendingDTO> getSpendinglist() {
        return spendinglist;
    }

    public void setSpendinglist(List<SpendingDTO> spendinglist) {
        this.spendinglist = spendinglist;
    }
}
