package com.mx.dao;

import com.mx.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IDeptDAO {
    public boolean addDept(Dept dept) ;
    public Dept findById(Integer id) ;
    public List<Dept> findAll() ;
}
