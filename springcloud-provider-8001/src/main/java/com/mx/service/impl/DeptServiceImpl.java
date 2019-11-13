package com.mx.service.impl;

import com.mx.dao.IDeptDAO;
import com.mx.entity.Dept;
import com.mx.service.IDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService {
    @Resource
    private IDeptDAO deptDAO ;
    @Override
    public boolean addDept(Dept dept){
        return deptDAO.addDept(dept) ;
    }
    @Override
    public Dept findById(Integer id){
        return deptDAO.findById(id) ;
    }
    @Override
    public List<Dept> findAll(){
        return deptDAO.findAll() ;
    }
}
