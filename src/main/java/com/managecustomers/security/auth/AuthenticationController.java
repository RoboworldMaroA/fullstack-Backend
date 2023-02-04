package com.managecustomers.security.auth;

import com.managecustomers.security.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
//@CrossOrigin(origins = "*")
public class AuthenticationController {

    //inject class
    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
        @RequestBody RegisterRequest request
    ){
        //this register method need to be implemented i AuthenticationService class
        return ResponseEntity.ok(service.register(request));
    }



    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ){

        //
        return ResponseEntity.ok(service.authenticate(request));
    }

    //Get all user details Method in AuthenticationService getAllUsers() allows me to get a users.
    @GetMapping("/allUsers")
    public List<User> getUsers() {
        return service.getAllUsers();
    }


}
