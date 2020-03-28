package com.wry.springcloud.service;

import com.wry.springcloud.entities.Payment;

/**
 * @author wry
 */
public interface PaymentService {

    /**
     * 新增
     * @param payment
     * @return
     */
    int insertPayment(Payment payment);

    /**
     * 修改
     * @param payment
     * @return
     */
    boolean updatePayment(Payment payment);

    /**
     * 删除
     * @param id
     * @return
     */
    boolean deletePayment(Long id);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    Payment selectById(Long id);
}
