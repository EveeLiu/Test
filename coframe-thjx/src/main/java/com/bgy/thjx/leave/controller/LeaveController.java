package com.bgy.thjx.leave.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"请假流程管理"})
@RequestMapping("/leave")
@RestController
public class LeaveController {
    @ApiOperation("测试接口")

    @GetMapping("/query")
    public String getProject(){
        String result = "hello";
        return result;
    }
}
