package com.vayi.springcloud.servce.impl;

import com.vayi.springcloud.dao.PaymentDao;
import com.vayi.springcloud.entities.Payment;
import com.vayi.springcloud.servce.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 描述
 *
 * @author vayi
 * @version 1.0
 * @date 2020/12/02
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById( Long id){
        return paymentDao.getPaymentById(id);
    }

}
