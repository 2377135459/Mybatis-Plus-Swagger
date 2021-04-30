package com.uniin.mybatisPlus.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import com.baomidou.mybatisplus.annotation.TableField;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * InnoDB free: 4096 kB
    * </p>
*
* @author zhangyy
* @since 2021-04-12
*/
    @Data
    @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class Land implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "land_id", type = IdType.AUTO)
    private Integer landId;

    @TableField("land_name")
    private String landName;

    @TableField("land_password")
    private String landPassword;


}
