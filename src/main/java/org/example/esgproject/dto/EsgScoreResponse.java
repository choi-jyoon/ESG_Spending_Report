package org.example.esgproject.dto;

public class EsgScoreResponse {
    private int environment;
    private int social;
    private int governance;

    public EsgScoreResponse(int environment, int social, int governance) {
        this.environment = environment;
        this.social = social;
        this.governance = governance;
    }

    public int getEnvironment() {
        return environment;
    }

    public int getSocial() {
        return social;
    }

    public int getGovernance() {
        return governance;
    }
}
