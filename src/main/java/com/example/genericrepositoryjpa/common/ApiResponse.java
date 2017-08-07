package com.example.genericrepositoryjpa.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Created by yasergh on 08/07/17.
 */
public class ApiResponse {

    private int status;
    private Object data;
    private String error;

    public ApiResponse() {
        this(null);
    }

    public ApiResponse(Object data) {
        this.data = data;
        this.error = null;
    }

    public ResponseEntity<ApiResponse> send(int status) {
        this.status = status;
        return new ResponseEntity<ApiResponse>(this, HttpStatus.valueOf(status));
    }

    public ResponseEntity<ApiResponse> send(int status, String error) {
        this.status = status;
        this.error = error;
        return new ResponseEntity<ApiResponse>(this, HttpStatus.valueOf(status));
    }

    public Object getData() {
        return data;
    }

    public String getError() {
        return error;
    }

    public int getStatus() {
        return this.status;
    }
}

