package com.wry.spingcloud.controller;

import com.wry.spingcloud.service.PaymentFeignService;
import com.wry.springcloud.entities.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wry
 */
@RestController
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        CommonResult commonResult = paymentFeignService.getData(id);
        return commonResult;
    }
}
