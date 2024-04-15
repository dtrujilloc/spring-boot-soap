package com.example.soap.api.endpoints;

import com.example.soap.api.metadataxsd.UserRequest;
import com.example.soap.api.metadataxsd.UserResponse;
import com.example.soap.api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@RequiredArgsConstructor
public class UserEndpoint {

    private final UserService userService;

    private final String NAMESPACE = "http://www.example.com/soap/api/metadataxsd";

    @PayloadRoot(namespace = NAMESPACE, localPart = "UserRequest")
    @ResponsePayload
    public UserResponse isAdultUser(@RequestPayload UserRequest userRequest) {
        return userService.isAdultUser(userRequest);
    }

}
