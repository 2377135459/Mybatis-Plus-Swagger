package com.uniin.mybatisPlus.controller;


import com.uniin.mybatisPlus.dto.LandDTO;
import com.uniin.mybatisPlus.service.ILandService;
import com.uniin.mybatisPlus.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.validation.Valid;


/**
 * <p>
 * InnoDB free: 4096 kB 前端控制器
 * </p>
 *
 * @author zhangyy
 * @since 2021-04-12
 */
@RestController
@RequestMapping("/land")
@Api(tags = "用户模块接口")
public class LandController {

    @Resource
    private ILandService landService;

    @ApiOperation(value = "登录接口")
    @PostMapping(value = "/landQuery")
    public Result<Boolean> save(@Valid @RequestBody LandDTO land) {
        return Result.success(landService.queryUserLand(land));
    }

}
