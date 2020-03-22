package com.example.huarun.dao;

import com.example.huarun.pojo.cst_order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

/**
 * cst_order: 实体类
 * BigInteger: id类型
 */
public interface cstOrderDao extends JpaRepository<cst_order, BigInteger> {
}
