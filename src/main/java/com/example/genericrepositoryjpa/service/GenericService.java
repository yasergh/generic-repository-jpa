package com.example.genericrepositoryjpa.service;

import com.example.genericrepositoryjpa.common.ApiResponse;
import com.example.genericrepositoryjpa.repository.CRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;


public abstract class GenericService<T , S extends Serializable> implements CrudService<T , S> {


   @Autowired
   CRUDRepository<T ,S > genericRepository;

    @Override
    public ResponseEntity<ApiResponse> get(Serializable id) {
        return new ApiResponse(genericRepository.findOne((S) id)).send(HttpStatus.OK.value());
    }

    @Override
    public ResponseEntity<ApiResponse> getAll() {
        return new ApiResponse(this.genericRepository.findAll()).send(HttpStatus.OK.value());
    }

    @Override
    public ResponseEntity<ApiResponse> add(T entity) {
        return null;
    }

    @Override
    public  ResponseEntity<ApiResponse> update(T entity) {
        return null;
    }


    @Override
    public ResponseEntity<ApiResponse> delete(Serializable id) {

        T model = this.genericRepository.findOne((S) id);

        if(model != null){

            this.genericRepository.delete((S) id);
            return new ApiResponse(id).send(HttpStatus.OK.value());

        }

        return new ApiResponse(id).send(HttpStatus.NOT_FOUND.value(),"the Row is Not Found !");

    }



}
