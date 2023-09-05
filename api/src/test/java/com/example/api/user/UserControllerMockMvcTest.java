package com.example.api.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
class UserControllerMockMvcTest {
    @Autowired
    private MockMvc mvc;
    @MockBean
    private UserService userService;
    @Test
    void getUserById() throws Exception {
        // Act and Assert
        this.mvc.perform(get("/user/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void getUserByIdWithSuccessAndCheckData() throws Exception {
        // Arrange
        UserResponse expected = new UserResponse();
        expected.setId(1);
        expected.setFirstname("Somkiat");
        expected.setLastname("Pui");
        when(userService.getById(1)).thenReturn(expected);
        // Act and Assert
        this.mvc.perform(get("/user/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.firstname").value("Somkiat"))
                .andExpect(jsonPath("$.lastname").value("Pui"));
    }
}
