package com;

public final class AnswerAnalyzer {
    private static final String CORRECT_ANSWER = "42";

    public boolean analyze(String answer){
        return answer.equals(CORRECT_ANSWER);
    }
}
