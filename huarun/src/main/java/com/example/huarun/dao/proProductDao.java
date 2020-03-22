package com.example.huarun.dao;

import com.example.huarun.pojo.pro_product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;

public interface proProductDao extends JpaRepository<pro_product, BigInteger> {

}
