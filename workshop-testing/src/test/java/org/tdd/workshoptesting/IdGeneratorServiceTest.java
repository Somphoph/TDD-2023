package org.tdd.workshoptesting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IdGeneratorServiceTest {

    @Test
    @DisplayName("้ต้องการ generate id = START-5")
    void case01() {
        // Arrange
        MyRandom random = bound -> 5;
        IdGeneratorService service = new IdGeneratorService();
        // Act
        String result = service.process(random);
        // Assert
        assertEquals("START-5", result);
    }
}