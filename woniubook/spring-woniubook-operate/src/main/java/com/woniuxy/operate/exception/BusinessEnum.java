package com.woniuxy.operate.exception;

public enum BusinessEnum implements IErrorCode {
    SYSTEM_BUSY(10000,"系统繁忙，请稍后重试！"),
    OPTIMISTIC_LOCK_ERROR(10001,"网络波动异常，请稍后重试！");
    private Integer code;
    private String message;
    private BusinessEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    @Override
    public Integer getCode() {
        return code;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
