package com.mx.controller;

import com.mx.entity.Dept;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptConsumerController {
//    private static final String REST_TEMPLATE_URL_PREFIX ="http://localhost:8001/" ;
    private static final String REST_TEMPLATE_URL_PREFIX ="http://CLOUDSERVICE-DEPT" ;

    @Resource
    private RestTemplate restTemplate ;
    @ResponseBody
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_TEMPLATE_URL_PREFIX+"/dept/add",dept,Boolean.class)  ;
    }
    @ResponseBody
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Dept getDeptById(@PathVariable("id") Integer id){
        return restTemplate.getForObject(REST_TEMPLATE_URL_PREFIX +"/dept/get/"+id, Dept.class) ;
    }
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return restTemplate.getForObject(REST_TEMPLATE_URL_PREFIX+"/dept/getAll",List.class) ;
    }
    @RequestMapping(value = "/discovery",method = RequestMethod.GET)
    public Object discovery(){
        return restTemplate.getForObject(REST_TEMPLATE_URL_PREFIX + "/dept/discovery",Object.class) ;
    }
}
