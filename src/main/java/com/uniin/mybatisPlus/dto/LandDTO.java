package com.uniin.mybatisPlus.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
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
public class LandDTO implements Serializable {

    @ApiModelProperty(value = "用户名")
    @NotBlank(message = "请输入用户名")
    @Length(message = "用户名不能超过个 {max} 字符", max = 11)
    private String landName;

    @ApiModelProperty(value = "密码")
    @NotBlank(message = "请输入密码")
    @Length(message = "密码不能超过个 {max} 字符", max = 6)
    private String landPassword;
}
