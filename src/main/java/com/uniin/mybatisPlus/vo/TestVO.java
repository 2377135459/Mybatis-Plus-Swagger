package com.uniin.mybatisPlus.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 4096 kB
 * </p>
 *
 * @author zhangyy
 * @since 2021-04-12
 */
@Data
public class TestVO implements Serializable {
    @ApiModelProperty(value = "测试用例")
    private String result;
}
