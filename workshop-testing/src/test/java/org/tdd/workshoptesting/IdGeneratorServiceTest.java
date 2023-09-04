package org.tdd.workshoptesting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorServiceTest {

    @Test
    @DisplayName("้ต้องการ generate id = START-5")
    void case01() {
        // Arrange
        IdGeneratorService.MyRandom random = bound -> 5;
        IdGeneratorService service = new IdGeneratorService();
        // Act
        String result = service.process(random);
        // Assert
        assertEquals("START-5", result);
    }
}