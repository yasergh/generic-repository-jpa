package com.example.genericrepositoryjpa.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * Created by yasergh on 04/07/17.
 */
@Service
public class PageRequestService {

    public PageRequest pagination(int page, int size)
    {
        PageRequest request = new PageRequest(page - 1, size);
        return request;
    }

    public PageRequest pagination(int page, int size, String sort , String field)
    {
        PageRequest request = new PageRequest(page - 1, size, Sort.Direction.fromString(sort), field);
        return request;
    }

}
