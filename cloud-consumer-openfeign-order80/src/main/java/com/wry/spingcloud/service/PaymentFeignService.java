package com.wry.spingcloud.service;

import com.wry.springcloud.entities.CommonResult;
import com.wry.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wry
 */
@FeignClient(value = "cloud-payment-service")
@Component
public interface PaymentFeignService {

    @GetMapping("/payment/{id}")
    CommonResult getData(@PathVariable("id") Long id);
}
