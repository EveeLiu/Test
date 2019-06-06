package com.bgy.thjx.team.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"团队管理"})
@RequestMapping("/team")
@RestController
public class TeamController {

    @ApiOperation("测试接口")

    @GetMapping("/query")
    public String getProject(){
        String result = "hello";
        return result;
    }
}
