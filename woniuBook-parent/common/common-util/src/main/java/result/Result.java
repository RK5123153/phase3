package result;

import lombok.Data;

/**
 * @Date 2023/7/13 11:52
 * @Author LZH
 * Description:
 */
@Data
public class Result<T> {

    //返回码
    private Integer code;

    //返回消息
    private String message;

    //返回数据
    private T data;

    public Result() {
    }

    /**
     * 返回数据
     *
     * @param data build(body)是一个静态方法，用于创建一个Result对象，
     *             并设置其数据部分（data）为传入的body参数。
     *             这里的body可以是任意类型的对象，根据具体的使用场景来决定。
     *             当调用build(body)方法时，它会返回一个Result对象，其中的数据部分（data）被设置为传入的body参数。
     *             这样，你就可以通过调用build(body)方法来创建一个带有指定数据的Result对象。
     * @return
     * @param <T>
     */
    protected static <T> Result<T> build(T data) {
        Result<T> result = new Result<T>();
        if (data != null)
            result.setData(data);
        return result;
    }

    public static <T> Result<T> build(T body, Integer code, String message) {
        Result<T> result = build(body);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static <T> Result<T> build(T body, ResultCodeEnum resultCodeEnum) {
        Result<T> result = build(body);
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }

    /**
     * 操作成功（无返回数据）
     * @return
     * @param <T>
     */
    public static <T> Result<T> ok() {
        return Result.ok(null);
    }

    /**
     * 操作成功
     *
     * @param data baseCategory1List
     * @param <T>
     * @return
     */
    public static <T> Result<T> ok(T data) {
        Result<T> result = build(data);
        return build(data, ResultCodeEnum.SUCCESS);
    }

    /**
     * 操作失败（无返回数据）
     * @return
     * @param <T>
     */
    public static <T> Result<T> fail() {
        return Result.fail(null);
    }

    /**
     * 操作失败
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> fail(T data) {
        Result<T> result = build(data);
        return build(data, ResultCodeEnum.FAIL);
    }

    public Result<T> message(String msg) {
        this.setMessage(msg);
        return this;
    }

    public Result<T> code(Integer code) {
        this.setCode(code);
        return this;
    }

}
