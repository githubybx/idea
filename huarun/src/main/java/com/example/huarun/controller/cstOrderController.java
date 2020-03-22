package com.example.huarun.controller;

import com.example.huarun.pojo.cst_order;
import com.example.huarun.pojo.cst_service;
import com.example.huarun.service.cstOrderService;
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
public class cstOrderController {
    @Autowired
    cstOrderService service;
    //查询所有数据
    @RequestMapping(value = "/get/cst_order/findAll",method = RequestMethod.GET)
    public List<cst_order> getAllOrder(){
        return service.selectAll();
    }
    //根据id查询数据
    @RequestMapping(value = "/get/cst_order/ById/{id}",method = RequestMethod.GET)
    public Optional<cst_order> getOrderById(@PathVariable("id") BigInteger id){
        return service.findByOdr_id(id);
    }
    //插入数据
    @RequestMapping("/post/cst_order/insert")
    public cst_order insertOrder(cst_order order){
        cst_order cstOrder = new cst_order(new BigInteger("1111"),"121",new Date(),"12","232");
        return service.insertOrder(cstOrder);
    }
    //更新数据(前提是主键一致)
    @RequestMapping("/post/cst_order/update")
    public cst_order updateOrder(cst_order product){
        cst_order pro_product = new cst_order(new BigInteger("5"),"11111",new Date(),"22222","232");
        return service.updateOrder(pro_product);
    }
    //根据主键删除数据
    @RequestMapping("/delete/cst_order/{id}")
    public void deleteOrderById(@PathVariable("id")BigInteger id){
        System.out.println("删除成功");
        service.deleteOrderById(id);
    }
}
