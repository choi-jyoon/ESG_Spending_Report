package org.example.esgproject.controller;

import org.example.esgproject.dto.EsgScoreResponse;
import org.example.esgproject.dto.SpendingDTO;
import org.example.esgproject.dto.SpendingRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/esg-score")
public class EsgController {

    @PostMapping
    public EsgScoreResponse calculateScore(@RequestBody SpendingRequest request) {
        int env=0, soc=0, gov=0;

        for (SpendingDTO dto : request.getSpendinglist()) {
            String cat = dto.getCategory();
            int amt = dto.getAmount();

            switch (cat) {
                case "식비":
                    env +=3;
                    soc+=1;
                    break;
                case "교통":
                    env+=3;
                    break;
                case "패션":
                    env -=1;
                    soc+=1;
                    break;
                default:
                    break;
            }
        }

        return new EsgScoreResponse(env,soc,gov);
    }
}
