package com.example.genericrepositoryjpa.service;

import java.util.HashMap;

/**
 * Created by yasergh on 04/07/17.
 */
public class PageFilter {
    private int page;
    private int size;
    private String sortOrder;
    private String sortBy;
    private HashMap search;

    public PageFilter() {
    }

    public PageFilter(int page, int size, String sortOrder, String sortBy) {
        this.page = page;
        this.size = size;
        this.sortOrder = sortOrder;
        this.sortBy = sortBy;
    }



    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public HashMap getSearch() {
        return search;
    }

    public void setSearch(HashMap search) {
        this.search = search;
    }
}
