package com.example.api.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    /**
     * 200 => Success
     * 404 => User not found , UserNotFoundException
     * 500 => System error , UserDatabaseException
     *
     * @param id
     * @return
     */
    public UserResponse getById(int id) {
        UserResponse result = new UserResponse();
        result.setId(id);
        result.setFirstname("Somkiat");
        result.setLastname("Pui");
        return result;
    }
}
