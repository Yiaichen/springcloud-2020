package com.vayi.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一Response返回
 *
 * @author vayi
 * @version 1.0
 * @date 2020/12/02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
