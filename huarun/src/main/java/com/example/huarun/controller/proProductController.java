package com.example.huarun.controller;

import com.example.huarun.pojo.pro_product;
import com.example.huarun.service.proProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@RestController
public class proProductController {
    @Autowired
    proProduceService service;
    //查询所有数据
    @RequestMapping(value = "/get/product/findAll",method = RequestMethod.GET)
    public List<pro_product> getAllProduct(){
        return service.selectAll();
    }
    //根据id查询数据
    @RequestMapping(value = "/get/product/findById/{id}",method = RequestMethod.GET)
    public Optional<pro_product> getProductById(@PathVariable("id")BigInteger id){
        return service.findByProd_id(id);
    }
    //插入数据
    @RequestMapping("/post/product/insert")
    public pro_product insertProduct(pro_product product){
        pro_product pro_product = new pro_product(new BigInteger("6"),"2323","32323","2323","adad",(float)1.2,"2323");
        return service.insertProduct(pro_product);
    }
    //更新数据(前提是主键一致)
    @RequestMapping("/post/product/update")
    public pro_product updateProduct(pro_product product){
        pro_product pro_product = new pro_product(new BigInteger("2"),"2222","32323","2323","adad",(float)1.2,"2323");
        return service.updateProduct(pro_product);
    }
    //根据主键删除数据
    @RequestMapping("/delete/product/{id}")
    public void deleteProductById(@PathVariable("id")BigInteger id){
        System.out.println("删除成功");
        service.deleteProductById(id);
    }
}
