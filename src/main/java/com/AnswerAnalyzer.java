package com;

public class AnswerAnalyzer {
    private static final String correctAnswer = "42";

    public boolean analyze(String answer){
        return answer.equals(correctAnswer);
    }
}
