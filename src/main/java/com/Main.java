package com;

import java.util.Scanner;

public final class Main {
    private Main() {};

    public static void main(String[] args) {
        System.out.println(new Interpreter().produceQuestion());
        System.out.println("This is" +
                (new AnswerAnalyzer().analyze(new Scanner(System.in).nextLine()) ? " a " : " not a ")
                + "correct answer");
    }
}
