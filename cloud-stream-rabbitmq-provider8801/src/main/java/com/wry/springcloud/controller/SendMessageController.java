package com.wry.springcloud.controller;

import com.wry.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Mr.Wang
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProviderImpl;

    @GetMapping("/sendMessage")
    public String sendMessage() {
        messageProviderImpl.send();
        return "send message success";
    }


}
