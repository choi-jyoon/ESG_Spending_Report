package org.example.esgproject.controller;

import jakarta.persistence.GeneratedValue;
import org.example.esgproject.dto.EsgReportResponse;
import org.example.esgproject.dto.EsgScoreResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/esg-report")
public class EsgReportController {

    @PostMapping
    public EsgReportResponse generateReport(@RequestBody EsgScoreResponse score) {
        int total = score.getEnvironment() + score.getSocial()+ score.getGovernance();
        String grade;
        String message;

        if (total>=7) {
            grade="A";
            message = "아주 훌륭한 소비 습관입니다! 환경과 사회에 긍정적 영향을 주고 있어요.";
        }
        else if (total >=4) {
            grade="B";
            message = "ESG 점수가 준수해요! 교통이나 식비 분야가 기여했을 수 있어요.";
        }
        else {
            grade="C";
            message="개선이 필요해요. 친환경 소비나 사회적 책임을 고려해보세요.";
        }

        return new EsgReportResponse(total, grade, message);
    }
}
