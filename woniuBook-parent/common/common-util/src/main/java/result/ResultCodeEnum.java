package result;

import lombok.Getter;

/**
 * @Date 2023/7/13 11:49
 * @Author LZH
 * Description:
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(200, "成功"),
    FAIL(201, "失败"),
    SERVICE_ERROR(2012, "服务异常"),
    DATA_ERROR(204, "数据异常"),
    LOGIN_MOBLE_ERROR(401, "登陆失败"),
    LOGIN_AUTH(208, "未登陆"),

    PERMISSION(209, "没有权限");

    private Integer code;
    private String message;

    private ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
