package com.wry.springcloud.controller;

import com.wry.springcloud.entities.CommonResult;
import com.wry.springcloud.entities.Payment;
import com.wry.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wry
 */
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment")
    public CommonResult insert(@RequestBody Payment payment) {
        int flag = paymentService.insertPayment(payment);
        return flag > 0 ? CommonResult.success("保存成功！端口："+serverPort, flag) : CommonResult.error("保存失败,端口："+serverPort);
    }

    @PutMapping("/payment")
    public CommonResult update(Payment payment) {
        boolean flag = paymentService.updatePayment(payment);
        return flag ? CommonResult.success("修改成功！端口："+serverPort, flag) : CommonResult.error("修改失败,端口："+serverPort);
    }

    @DeleteMapping("/payment/{id}")
    public CommonResult delete(@PathVariable("id") Long id) {
        boolean flag = paymentService.deletePayment(id);
        return flag ? CommonResult.success("删除成功！端口："+serverPort) : CommonResult.error("删除失败,端口："+serverPort);
    }

    @GetMapping("/payment/{id}")
    public CommonResult select(@PathVariable("id") Long id) {
        Payment payment = paymentService.selectById(id);
        return payment != null ? CommonResult.success("查询成功！端口："+serverPort, payment):CommonResult.success("没有对应数据，端口："+serverPort);
    }
    @GetMapping("/payment/get/{id}")
    public CommonResult getId(@PathVariable("id") Long id) {
        Payment payment = paymentService.selectById(id);
        return payment != null ? CommonResult.success("查询成功！端口：" + serverPort, payment) : CommonResult.success("没有对应数据，端口：" + serverPort);
    }

    @GetMapping("/payment/lb")
    public Object lb() {
        return serverPort;
    }
}
