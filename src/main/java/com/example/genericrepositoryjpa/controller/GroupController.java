package com.example.genericrepositoryjpa.controller;

import com.example.genericrepositoryjpa.common.ApiResponse;
import com.example.genericrepositoryjpa.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

;

/**
 * Created by yasergh on 30/06/17.
 */
@RestController
@RequestMapping(value = "/api")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @RequestMapping(value = "/groups",method = RequestMethod.GET)
    public ResponseEntity<ApiResponse> getGroups() {
        return new ApiResponse(groupService.getAll()).send(HttpStatus.OK.value());
    }


}
