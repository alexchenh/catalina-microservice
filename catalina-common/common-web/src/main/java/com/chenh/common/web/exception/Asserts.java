package com.chenh.common.web.exception;

import com.chenh.common.core.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 * @author chenh
 * @date 2021年03月27日
 */
public class Asserts {

    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
