package org.example.esgproject.dto;

public class EsgReportResponse {
    private  int totalScore;
    private String grade;
    private String message;

    public EsgReportResponse(int totalScore, String grade, String message) {
        this.totalScore=totalScore;
        this.grade=grade;
        this.message=message;
    }

    public int getTotalScore(){
        return totalScore;
    }

    public String getGrade(){
        return grade;
    }

    public String getMessage(){
        return message;
    }
}
