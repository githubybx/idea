package com.example.huarun.dao;

import com.example.huarun.pojo.cst_service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface cstServiceDao extends JpaRepository<cst_service, BigInteger> {
}
