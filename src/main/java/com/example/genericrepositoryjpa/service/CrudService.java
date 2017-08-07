package com.example.genericrepositoryjpa.service;

import com.example.genericrepositoryjpa.common.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Transactional
public interface CrudService<T, S extends Serializable>  {

    public ResponseEntity<ApiResponse> get(S id);

    public ResponseEntity<ApiResponse> getAll();

    public ResponseEntity<ApiResponse> add(T entity);

    public ResponseEntity<ApiResponse> update(T entity);

    public ResponseEntity<ApiResponse> delete(S id);

}
