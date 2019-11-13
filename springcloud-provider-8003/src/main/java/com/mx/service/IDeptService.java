package com.mx.service;

import com.mx.dao.IDeptDAO;
import com.mx.entity.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public interface IDeptService {
    public boolean addDept(Dept dept);
    public Dept findById(Integer id);
    public List<Dept> findAll();
}
