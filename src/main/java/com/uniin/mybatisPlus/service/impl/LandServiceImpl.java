package com.uniin.mybatisPlus.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniin.mybatisPlus.dto.LandDTO;
import com.uniin.mybatisPlus.entity.Land;
import com.uniin.mybatisPlus.mapper.LandMapper;
import com.uniin.mybatisPlus.service.ILandService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 4096 kB 服务实现类
 * </p>
 *
 * @author zhangyy
 * @since 2021-04-12
 */
@Service
public class LandServiceImpl extends ServiceImpl<LandMapper, Land> implements ILandService {

    @Override
    public Boolean queryUserLand(LandDTO land) {
        LambdaQueryWrapper<Land> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(Land::getLandName, land.getLandName())
                .eq(Land::getLandPassword, land.getLandPassword());
        Land l=baseMapper.selectOne(wrapper);
        return !(l==null);
    }
}
