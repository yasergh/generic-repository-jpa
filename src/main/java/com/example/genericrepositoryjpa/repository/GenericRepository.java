package com.example.genericrepositoryjpa.repository;


import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by yasergh on 04/08/17.
 */
@Repository
public abstract class GenericRepository<T,ID  extends Serializable> implements CRUDRepository<T, ID> {
}
