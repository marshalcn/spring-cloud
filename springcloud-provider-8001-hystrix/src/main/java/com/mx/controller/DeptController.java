package com.mx.controller;

import com.mx.entity.Dept;
import com.mx.service.DeptClientService;
import com.mx.service.IDeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {
    @Resource
    private IDeptService service = null;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept){
        return service.addDept(dept) ;
    }
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept getById(@PathVariable Integer id){
        Dept dept = service.findById(id) ;
        if (null == dept){
            throw new RuntimeException("Error id : " + id) ;
        }
        return dept ;
    }
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> getAll(){
        return service.findAll() ;
    }
    public Dept processHystrix_Get(@PathVariable("id") Integer id){
        Dept d = new Dept() ;
        d.setDeptno(id);
        d.setDname("Cant find id :" + id + "@HystrixCommand") ;
        return d ;
    }
}
