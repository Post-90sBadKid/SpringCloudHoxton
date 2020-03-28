package com.wry.springcloud.controller;

import com.wry.springcloud.entities.CommonResult;
import com.wry.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wry
 */
@RestController
public class OrderController {

//    private static final String PAYMENT_URL="http://localhost:8001";
    private static final String PAYMENT_URL="http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment")
    public CommonResult<Payment> insert(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL+"/payment",payment,CommonResult.class);
    }


    @GetMapping("/consumer/payment/{id}")
    public CommonResult select(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL+"/payment/"+id,CommonResult.class);
    }
}
