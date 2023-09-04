package org.tdd.workshoptesting;

import java.util.Random;

public class IdGeneratorService {

    public String process(Random r) {
        String id = "START-";
        int number = r.nextInt(10);
        return id + number;
    }

}
