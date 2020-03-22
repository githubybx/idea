package com.example.huarun.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.GeneratorStrategy;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
//表名
@Table(name = "pro_product")
//get,set,toString
@Data
//无参
@NoArgsConstructor
//全参
@AllArgsConstructor
public class pro_product {
    @Id
    //主键生成策略(JPA自动选择合适的策略)
    //@GeneratedValue(strategy= GenerationType.AUTO)
    BigInteger prod_id;
    String prod_name;
    String prod_type;
    String prod_batch;
    String prod_unit;
    float prod_price;
    String prod_memo;
}
