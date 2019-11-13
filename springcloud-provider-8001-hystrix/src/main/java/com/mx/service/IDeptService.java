package com.mx.service;

import com.mx.entity.Dept;

import java.util.List;


public interface IDeptService {
    public boolean addDept(Dept dept);
    public Dept findById(Integer id);
    public List<Dept> findAll();
}
