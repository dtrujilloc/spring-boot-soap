package com.example.soap.api.services;

import com.example.soap.api.metadataxsd.UserRequest;
import com.example.soap.api.metadataxsd.UserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final int ADULT_AGE = 18;

    public UserResponse isAdultUser(UserRequest userRequest) {
        UserResponse userResponse = new UserResponse();
        userResponse.setIsAdult(false);

        if (userRequest.getAge() >= ADULT_AGE) {
            userResponse.setIsAdult(true);
        }

        return userResponse;
    }
}
