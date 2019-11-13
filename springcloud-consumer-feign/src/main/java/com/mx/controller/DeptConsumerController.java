package com.mx.controller;

import com.mx.entity.Dept;
import com.mx.service.DeptClientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptConsumerController {
    @Resource
    private DeptClientService service ;
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Integer id) {
        return service.get(id) ;
    }
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return service.list() ;
    }
    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(Dept dept) {
        return service.add(dept) ;
    }
}
