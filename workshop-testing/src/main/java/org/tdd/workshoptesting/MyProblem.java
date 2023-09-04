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

    public int getStartNumber() {
        if (isStartWithInclude()) {
            return Integer.parseInt(input.charAt(1) + "");
        } else {
            return Integer.parseInt(input.charAt(1) + "") + 1;
        }
    }

    public int getEndNumber() {
        if (isEndWithInclude()) {
            return Integer.parseInt(input.charAt(3) + "");
        } else {
            return Integer.parseInt(input.charAt(3) + "") - 1;
        }
    }

    public String process() {
        // Validate inputs
        if (!input.startsWith("[") && !input.startsWith("(")) {
            throw new InputInvalidException("Error case01");
        }
        // Generate result
        StringBuilder result = new StringBuilder();
        int start = getStartNumber();
        int end = getEndNumber();
        for (int i = start; i <= end; i++) {
            result.append(i);
        }
        return result.toString();
    }
}
