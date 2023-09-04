package org.tdd.workshoptesting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyProblemInputValidationFailTest {

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