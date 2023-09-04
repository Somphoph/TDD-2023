package org.tdd.workshoptesting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyProblemTest {
    @Test
    @DisplayName("เริ่มด้วย [")
    void startWithSqrBracket() {
        // Arrange
        MyProblem myProblem = new MyProblem("[1,5]");
        // Act
        boolean result = myProblem.isStartWithInclude();
        // Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("เริ่มด้วย (")
    void startWithBracket() {
        // Arrange
        MyProblem myProblem = new MyProblem("(1,5]");
        // Act
        boolean result = myProblem.isStartWithInclude();
        // Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("จบด้วย ]")
    void endWithSqrBracket() {
        // Arrange
        MyProblem myProblem = new MyProblem("[1,5]");
        // Act
        boolean result = myProblem.isEndWithInclude();
        // Assert
        assertTrue(result);
    }

    @Test
    @DisplayName("จบด้วย )")
    void endWithBracket() {
        // Arrange
        MyProblem myProblem = new MyProblem("[1,5)");
        // Act
        boolean result = myProblem.isEndWithInclude();
        // Assert
        assertFalse(result);
    }

    @Test
    @DisplayName("เริ่มต้อน [1,5] => 1")
    void getStartNumberWithSqr() {
        // Arrange
        MyProblem myProblem = new MyProblem("[1,5)");
        // Act
        int result = myProblem.getStart();
        // Assert
        assertEquals(1, result);
    }

    @Test
    @DisplayName("เริ่มต้อน (1,5] => 1")
    void getStartNumberWithBracket() {
        // Arrange
        MyProblem myProblem = new MyProblem("(1,5)");
        // Act
        int result = myProblem.getStart();
        // Assert
        assertEquals(2, result);
    }
}