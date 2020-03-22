package com.example.huarun.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@Table(name = "cst_service")
@NoArgsConstructor
@AllArgsConstructor
public class cst_service {
    @Id
    //主键生成策略(JPA自动选择合适的策略)
    //@GeneratedValue(strategy= GenerationType.AUTO)
    BigInteger svr_id;
    String svr_type;
    String svr_title;
    String svr_cust_no;
    String svr_status;
    String svr_request;
    BigInteger svr_create_id;
    String svr_create_name;
    Date svr_create_date;
    BigInteger svr_due_id;
    String svr_due_name;
    Date svr_due_date;
    String svr_deal;
    BigInteger svr_deal_id;
    String svr_deal_name;
    Date svr_deal_date;
    String svr_result;
    int svr_satisfy;
}
