package com.vayi.springcloud.servce;

import com.vayi.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 描述
 *
 * @author vayi
 * @version 1.0
 * @date 2020/12/02
 */
public interface PaymentService {

    public int create(Payment payment); //写
    public Payment getPaymentById(@Param("id") Long id);  //读取

}
