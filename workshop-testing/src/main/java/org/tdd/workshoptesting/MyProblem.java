package org.tdd.workshoptesting;

public class MyProblem {

    private final String input;

    public MyProblem(String input) {
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public boolean isEndWithInclude() {
        return this.input.endsWith("]");
    }

    public int getStart() {
        if (isStartWithInclude()) {
            return Integer.parseInt(input.charAt(1) + "");
        } else {
            return Integer.parseInt(input.charAt(1) + "") + 1;
        }
    }
}
