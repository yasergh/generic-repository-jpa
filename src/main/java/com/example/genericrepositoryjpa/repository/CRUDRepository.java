package com.example.genericrepositoryjpa.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;


import java.io.Serializable;

/**
 * Created by yasergh on 04/08/17.
 */
@NoRepositoryBean
public interface CRUDRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID>, CrudRepository<T, ID> {

}
