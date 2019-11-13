package com.mx.service;

import com.mx.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

//@FeignClient(value = "CLOUDSERVICE-DEPT")
@FeignClient(value = "CLOUDSERVICE-DEPT", fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Integer id) ;
    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List<Dept> list();
    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    boolean add(Dept dept) ;
}
