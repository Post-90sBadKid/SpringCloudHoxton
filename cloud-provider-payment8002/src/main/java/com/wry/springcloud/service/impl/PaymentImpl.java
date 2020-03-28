package com.wry.springcloud.service.impl;

import com.wry.springcloud.entities.Payment;
import com.wry.springcloud.mapper.PaymentMapper;
import com.wry.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wry
 */
@Service
@Slf4j
public class PaymentImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int insertPayment(Payment payment) {
        return paymentMapper.insertSelective(payment);
    }

    @Override
    public boolean updatePayment(Payment payment) {
        paymentMapper.updateByPrimaryKeySelective(payment);
        return true;
    }

    @Override
    public boolean deletePayment(Long id) {
        paymentMapper.deleteByPrimaryKey(id);
        return true;
    }

    @Override
    public Payment selectById(Long id) {
        return   paymentMapper.selectByPrimaryKey(id);
    }
}
