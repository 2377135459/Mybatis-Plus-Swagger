package com.uniin.mybatisPlus.controller;

import com.uniin.mybatisPlus.utils.Result;
import com.uniin.mybatisPlus.vo.TestVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangyy
 */
@RestController
@RequestMapping("/test")
@Api(tags = "测试接口")
public class TestController {

    /**
     * 测试
     *
     * @return
     */
    @ApiOperation(value = "测试接口")
    @GetMapping("/test")
    public Result<String> test() {
        return Result.success("hello word!");
    }
}

