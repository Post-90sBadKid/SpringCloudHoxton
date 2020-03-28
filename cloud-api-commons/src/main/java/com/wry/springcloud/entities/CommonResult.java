package com.wry.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wry
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public static  CommonResult error(String message) {
        return new CommonResult<Object>(444, message,null);
    }

    public static  CommonResult success(String message) {
        return new CommonResult<Object>(200, message, null);
    }

    public static <T> CommonResult success(String message, T data) {
        return new CommonResult(200, message, data);
    }


}

