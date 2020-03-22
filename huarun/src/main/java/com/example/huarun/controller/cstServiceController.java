package com.example.huarun.controller;

import com.example.huarun.dao.cstServiceDao;
import com.example.huarun.pojo.cst_service;
import com.example.huarun.service.cstServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class cstServiceController {
    @Autowired
    cstServiceService service;
    //查询所有数据
    @RequestMapping(value = "/get/cstService/findAll",method = RequestMethod.GET)
    public List<cst_service> getAllCstService(){
        return service.selectAll();
    }
    //根据id查询数据
    @RequestMapping(value = "/get/cstService/findById/{id}",method = RequestMethod.GET)
    public Optional<cst_service> getCstServiceById(@PathVariable("id") BigInteger id){
        return service.findBySvr_id(id);
    }
    //插入数据
    @RequestMapping("/post/cstService/insert")
    public cst_service insertCstService(cst_service service1){
        cst_service cstService = new cst_service(new BigInteger("6"),"111","222","333","444","555",new BigInteger("121"),"create_name",new Date(),new BigInteger("121"),
                "due_name",new Date(),"121",new BigInteger("121"), "111", new Date(), "111", 1);
        return service.insertCstService(cstService);
    }
    //更新数据(前提是主键一致)
    @RequestMapping("/post/cstService/update")
    public cst_service updateCstService(cst_service cstService1){
        cst_service cstService = new cst_service(new BigInteger("6"),"111","222","333","444","555",new BigInteger("121"),"create_name",new Date(),new BigInteger("121"),
                "due_name",new Date(),"121",new BigInteger("121"), "111", new Date(), "111", 1);
        return service.updateCstService(cstService);
    }
    //根据主键删除数据
    @RequestMapping("/delete/cstService/{id}")
    public void deleteCstServiceById(@PathVariable("id")BigInteger id){
        System.out.println("删除成功");
        service.deleteCstServiceById(id);
    }
}
