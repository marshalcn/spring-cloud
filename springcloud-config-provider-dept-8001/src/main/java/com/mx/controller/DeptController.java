package com.mx.controller;

import com.mx.entity.Dept;
import com.mx.service.IDeptService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Resource
    private IDeptService deptService ;
    @Resource
    private DiscoveryClient discoveryClient ;

    @RequestMapping(value = "/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices() ;
        System.out.println("#################"+ list);
        List<ServiceInstance> services = discoveryClient.getInstances("CLOUDSERVICE-DEPT") ;
        for (ServiceInstance s : services){
            System.out.println("############ Host " + s.getHost()+"\t"+s.getPort()+"\t"+s.getServiceId()+"\t"+s.getUri());
        }
        return discoveryClient ;
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept) ;
    }
    @ResponseBody
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Dept getById(@PathVariable Integer id){
        return deptService.findById(id) ;
    }
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Dept> getAll(){
        return deptService.findAll() ;
    }
}
