package com.example.huarun.service;

import com.example.huarun.dao.proProductDao;
import com.example.huarun.pojo.pro_product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class proProduceService {
    @Autowired
    proProductDao proProductDao;

    //查询所有商品
    public List<pro_product> selectAll() {
        return proProductDao.findAll();
    }

    //根据商品Id查询商品
    public Optional<pro_product> findByProd_id(BigInteger id) {
        Optional<pro_product> byId = proProductDao.findById(id);
        return byId;
    }

    //增加商品信息
    public pro_product insertProduct(pro_product product) {
        return proProductDao.save(product);
    }

    //修改商品信息
    public pro_product updateProduct(pro_product product) {
        return proProductDao.save(product);
    }

    //根据Id删除商品信息
    public void deleteProductById(BigInteger id) {
        proProductDao.deleteById(id);
    }
}

