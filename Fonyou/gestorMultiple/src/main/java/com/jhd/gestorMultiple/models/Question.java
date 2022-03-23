package com.jhd.gestorMultiple.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    public String title;
    public Integer points;
    public List<answers> answers;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class answers{
        public String titleAnswers;
        public boolean trueFalse;
    }
}
