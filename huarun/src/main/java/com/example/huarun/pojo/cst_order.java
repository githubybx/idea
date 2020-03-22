package com.example.huarun.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "cst_order1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class cst_order {
    @Id
    //主键生成策略(JPA自动选择合适的策略)
    //@GeneratedValue(strategy= GenerationType.AUTO)
    BigInteger odr_id;
    String odr_cust_no;
    //前端传过来的String类型时间会解析成Date类型
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date odr_date;
    String odr_addr;
    String odr_status;
}
