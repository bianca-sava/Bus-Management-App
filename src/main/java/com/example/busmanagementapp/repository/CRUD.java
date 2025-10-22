package com.example.busmanagementapp.repository;

import java.util.List;

public interface CRUD<T> {
    public void create(T entity);
    public List<T> findAll();
    public T findById(String id);
    public void update(String id,  T entity);
    public void delete(String id);
}
