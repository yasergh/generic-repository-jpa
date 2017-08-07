package com.example.genericrepositoryjpa.controller;

;
import com.example.genericrepositoryjpa.common.ApiResponse;
import com.example.genericrepositoryjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

/**
 * Created by yasergh on 30/06/17.
 */
@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public ResponseEntity<ApiResponse> getUsers() {
        return new ApiResponse(this.userService.getAll()).send(HttpStatus.OK.value());
    }


}
