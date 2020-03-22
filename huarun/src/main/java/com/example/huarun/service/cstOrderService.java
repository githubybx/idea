package com.example.huarun.service;

import com.example.huarun.dao.cstOrderDao;
import com.example.huarun.dao.cstServiceDao;
import com.example.huarun.pojo.cst_order;
import com.example.huarun.pojo.cst_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class cstOrderService {
    @Autowired
    cstOrderDao cstOrderDao;
    //查询所有商品
    public List<cst_order> selectAll() {
        return cstOrderDao.findAll();
    }

    //根据商品Id查询商品
    public Optional<cst_order> findByOdr_id(BigInteger id) {
        return cstOrderDao.findById(id);
    }

    //增加商品信息
    public cst_order insertOrder(cst_order service) {
        return cstOrderDao.save(service);
    }

    //修改商品信息
    public cst_order updateOrder(cst_order service) {
        return cstOrderDao.save(service);
    }

    //根据Id删除商品信息
    public void deleteOrderById(BigInteger id) {
        cstOrderDao.deleteById(id);
    }

}
