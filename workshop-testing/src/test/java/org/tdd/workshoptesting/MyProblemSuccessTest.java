package org.tdd.workshoptesting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyProblemSuccessTest {
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
        int result = myProblem.getStartNumber();
        // Assert
        assertEquals(1, result);
    }

    @Test
    @DisplayName("เริ่มต้อน (1,5] => 2")
    void getStartNumberWithBracket() {
        // Arrange
        MyProblem myProblem = new MyProblem("(1,5)");
        // Act
        int result = myProblem.getStartNumber();
        // Assert
        assertEquals(2, result);
    }

    @Test
    @DisplayName("เริ่มต้อน [1,9] => 9")
    void getEndNumberWithSqr() {
        // Arrange
        MyProblem myProblem = new MyProblem("[1,9]");
        // Act
        int result = myProblem.getEndNumber();
        // Assert
        assertEquals(9, result);
    }

    @Test
    @DisplayName("เริ่มต้อน [1,9) => 8")
    void getEndNumberWithBracket() {
        // Arrange
        MyProblem myProblem = new MyProblem("(1,9)");
        // Act
        int result = myProblem.getEndNumber();
        // Assert
        assertEquals(8, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] => 12345")
    void runNumberByInput() {
        // Arrange
        MyProblem myProblem = new MyProblem("[1,5]");
        // Act
        String result = myProblem.process();
        // Assert
        assertEquals("12345", result);
    }

    //Test To failure
    @Test
    @DisplayName("input ไม่ถูกต้อง คือ 1,5] => throw InputInvalidException")
    void inputWrongData01() {
        // Arrange
        MyProblem myProblem = new MyProblem("1,5]");
        // Act
        try {
            myProblem.process();
            fail("InputInvalidException not found !!");
        } catch (InputInvalidException e) {
            assertEquals("Error case01", e.getMessage());
        }
    }

    @Test
    @DisplayName("Junit 5 => input ไม่ถูกต้อง คือ 1,5] => throw InputInvalidException")
    void inputWrongData02() {
        // Arrange
        MyProblem myProblem = new MyProblem("1,5]");
        // Act
        InputInvalidException e = assertThrows(InputInvalidException.class, myProblem::process);
        assertEquals("Error case01", e.getMessage());
    }
}