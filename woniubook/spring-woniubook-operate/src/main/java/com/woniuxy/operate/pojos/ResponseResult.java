package com.woniuxy.operate.pojos;

import com.woniuxy.operate.exception.IErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseResult<T> {
    //业务状态码 200-成功
    private Integer code;
    //业务状态码的描述
    private String msg;
    //响应给前端的数据
    private T datas;
    public static ResponseResult ok(){
        return new ResponseResult(200,"ok",null);
    }
    public static <T> ResponseResult ok(T datas){
        return new ResponseResult(200,"ok",datas);
    }
    /**
     * 处理错误信息
     * @param errorCode
     * @return
     */
    public static ResponseResult fail(IErrorCode errorCode){
        return new ResponseResult(errorCode.getCode(),errorCode.getMessage(),null);
    }
    public static ResponseResult fail(){
        return new ResponseResult(201,"fail",null);
    }
}
