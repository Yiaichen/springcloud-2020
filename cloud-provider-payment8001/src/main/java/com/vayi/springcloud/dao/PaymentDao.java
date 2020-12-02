package com.vayi.springcloud.dao;

import com.vayi.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 业务接口
 *
 * @author vayi
 * @version 1.0
 * @date 2020/12/02
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);
    public Payment  getPaymentById(@Param("id")Long id);

}
