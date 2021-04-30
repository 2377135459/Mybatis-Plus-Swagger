package com.uniin.mybatisPlus.utils;

import com.uniin.mybatisPlus.Enum.ResponseCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 4096 kB 前端控制器
 * </p>
 *
 * @author zhangyy
 * @since 2021-04-12
 */

@ApiModel(value = "统一返回结果")
@Data
public class Result<T> implements Serializable {

    @ApiModelProperty(value = "0000为正常，其它为错误")
    private String code;

    @ApiModelProperty(value = "提示信息")
    private String msg = "";

    @ApiModelProperty(value = "结果内容")
    private T data;

    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public static<T> Result<T> success(T data) {
        return new Result<>(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMsg(), data);
    }

    public static<T> Result<T> error(T data) {
        return new Result<>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMsg(), data);
    }
}
