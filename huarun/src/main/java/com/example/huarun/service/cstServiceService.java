package com.example.huarun.service;

import com.example.huarun.dao.cstServiceDao;
import com.example.huarun.dao.proProductDao;
import com.example.huarun.pojo.cst_service;
import com.example.huarun.pojo.pro_product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class cstServiceService {
    @Autowired
    cstServiceDao cstServiceDao;

    //查询所有商品
    public List<cst_service> selectAll() {
        return cstServiceDao.findAll();
    }

    //根据商品Id查询商品
    public Optional<cst_service> findBySvr_id(BigInteger id) {
        return cstServiceDao.findById(id);
    }

    //增加商品信息
    public cst_service insertCstService(cst_service service) {
        return cstServiceDao.save(service);
    }

    //修改商品信息
    public cst_service updateCstService(cst_service service) {
        return cstServiceDao.save(service);
    }

    //根据Id删除商品信息
    public void deleteCstServiceById(BigInteger id) {
        cstServiceDao.deleteById(id);
    }
}
