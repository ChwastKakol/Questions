package com;

import java.util.concurrent.ThreadLocalRandom;

public final class Interpreter {
    private String getRandom(String[] array){
        return array[ThreadLocalRandom.current().nextInt(0, array.length)];
    }

    private static final String[] QUESTIONS = new String[]{"Why", "How", "When"};
    private static final String[] OBJECTS = new String[]{"cat", "mug", "student"};
    private static final String[] VERBS = new String[]{"work", "sleep", "suffer"};

    public String produceQuestion(){
        return getRandom(QUESTIONS) + " does " + getRandom(OBJECTS) + " " + getRandom(VERBS) + "?";
    }
}
