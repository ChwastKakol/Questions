package com;

import java.util.concurrent.ThreadLocalRandom;

public class Interpreter {
    private String getRandom(String[] array){
        return array[ThreadLocalRandom.current().nextInt(0, array.length)];
    }

    private final static String[] questions = new String[]{"Why", "How", "When"};
    private final static String[] objects = new String[]{"cat", "mug", "student"};
    private final static String[] verbs = new String[]{"work", "sleep", "suffer"};

    public String produceQuestion(){
        return getRandom(questions) + " does " + getRandom(objects) + " " + getRandom(verbs) + "?";
    }
}
