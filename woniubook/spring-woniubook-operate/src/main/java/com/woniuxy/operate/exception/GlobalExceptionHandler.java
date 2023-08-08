package com.woniuxy.operate.exception;

import com.woniuxy.operate.pojos.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 定义一个全局异常处理器
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 表示该方法只处理业务异常
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public ResponseResult handler(BusinessException e){
        e.printStackTrace();
        return ResponseResult.fail(e.getErrorCode());
    }
}
