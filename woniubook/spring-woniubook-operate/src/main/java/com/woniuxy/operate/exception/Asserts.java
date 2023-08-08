package com.woniuxy.operate.exception;

public class Asserts {
    /**
     * 抛出异常
     * @param condition
     * @param errorCode
     */
    public static void fail(boolean condition,IErrorCode errorCode){
        if(condition == true) {
            throw new BusinessException(errorCode);
        }
    }
}