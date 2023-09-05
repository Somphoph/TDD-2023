package com.example.api.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerWithErrorTest {
    @Autowired
    private TestRestTemplate restTemplate;
    @MockBean
    private UserService userService;
    @Test
    @DisplayName("User not found with UserNotFoundException, code = 404")
    void getUserById() {
        // Arrange
        ErrorResponse expected = new ErrorResponse();
        expected.setMessage("");
        when(userService.getById(2)).thenThrow(new UserNotFoundException(""));
        //Act
        ResponseEntity<ErrorResponse> result = restTemplate.getForEntity("/user/2", ErrorResponse.class);
        //Assert
        assertEquals(HttpStatus.NOT_FOUND, result.getStatusCode());
        assertEquals("", Objects.requireNonNull(result.getBody()).getMessage());
        assertEquals(expected, result.getBody());
    }
}