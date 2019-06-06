package com.bgy.thjx.vote.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"投票流程管理"})
@RequestMapping("/vote")
@RestController

public class VoteController {
    @ApiOperation("测试接口")

    @GetMapping("/query")
    public String getProject(){
        String result = "hello";
        return result;
    }
}
