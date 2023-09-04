package org.tdd.workshoptesting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class IdGeneratorServiceMockitoTest {
    @Mock
    private MyRandom random;

    @Test
    @DisplayName("ต้องการ generate id = START-5")
    void case01() {
        // Arrange
        // Stub
        when(random.nextInt(10)).thenReturn(5);
        IdGeneratorService service = new IdGeneratorService();
        // Act
        String result = service.process(random);
        // Assert
        assertEquals("START-5", result);
    }
}
