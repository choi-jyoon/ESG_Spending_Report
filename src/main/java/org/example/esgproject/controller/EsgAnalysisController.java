package org.example.esgproject.controller;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.example.esgproject.dto.CategoryAnalysisResponse;
import org.example.esgproject.dto.SpendingDTO;
import org.example.esgproject.dto.SpendingRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/esg-analysis")
public class EsgAnalysisController {

    @PostMapping
    public CategoryAnalysisResponse analyze(@RequestBody SpendingRequest request) {
        Map<String, Integer> categorySum = new HashMap<>();
        int total=0;

        for (SpendingDTO dto: request.getSpendinglist()) {
            String cat = dto.getCategory();
            int amt = dto.getAmount();

            categorySum.put(cat, categorySum.getOrDefault(cat, 0)+amt);
            total+=amt;
        }

        Map<String, String> ratio = new HashMap<>();
        for (String cat : categorySum.keySet()) {
            int amt = categorySum.get(cat);
            int percent = (int)Math.round((amt * 100.0) / total);
            ratio.put(cat, percent + "%");
        }

        String insight;
        if (categorySum.getOrDefault("식비", 0) > total * 0.5) {
            insight = "식비 비중이 높습니다. 지역 식재료를 고려해보세요.";
        }
        else if (categorySum.getOrDefault("패션", 0) > total*0.4) {
            insight = "패션 소비가 높습니다. 재활용/친환경 패션에 관심을 가져보세요.";
        }
        else {
            insight = "소비가 균형 잡혀 있습니다. ESG 관점에서 좋은 소비입니다.";
        }
        return new CategoryAnalysisResponse(total, categorySum, ratio, insight);
    }
}
