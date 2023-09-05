package com.example.api.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserResponse getById(int id){
        UserResponse result = new UserResponse();
        result.setId(id);
        result.setFirstname("Somkiat");
        result.setLastname("Pui");
        return result;
    }
}
