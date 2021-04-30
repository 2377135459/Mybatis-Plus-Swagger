package com.uniin.mybatisPlus.Enum;

import lombok.Getter;

/**
 * <p>
 * InnoDB free: 4096 kB 前端控制器
 * </p>
 *
 * @author zhangyy
 * @since 2021-04-12
 */
@Getter
public enum ResponseCode {
    /**
     * 执行返回
     */
    SUCCESS("0000", "执行成功"),
    /**
     * 执行返回
     */
    ERROR("9999", "执行异常");

    ResponseCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private final String code;

    private final String msg;

    public static ResponseCode of(String code) {
        for (ResponseCode ty : values()) {
            if (ty.getCode().equals(code)) {
                return ty;
            }
        }
        throw new RuntimeException("无效的编码" + code);
    }
}
