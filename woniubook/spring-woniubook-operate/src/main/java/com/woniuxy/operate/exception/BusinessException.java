package com.woniuxy.operate.exception;

import lombok.Getter;

/**
 * 业务异常
 */
@Getter
public class BusinessException extends RuntimeException{
    private IErrorCode errorCode;
    public BusinessException() {
    }
    public BusinessException(IErrorCode errorCode) {
        this.errorCode = errorCode;
    }
}
