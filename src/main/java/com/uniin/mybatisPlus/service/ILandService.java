package com.uniin.mybatisPlus.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.uniin.mybatisPlus.dto.LandDTO;
import com.uniin.mybatisPlus.entity.Land;

/**
 * <p>
 * InnoDB free: 4096 kB 服务类
 * </p>
 *
 * @author zhangyy
 * @since 2021-04-12
 */
public interface ILandService extends IService<Land> {

    Boolean queryUserLand(LandDTO land);
}
