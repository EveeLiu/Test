package com.bgy.thjx.user.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bgy.thjx.user.mapper.SysUserMapper;
import com.bgy.thjx.user.model.po.SysUser;
import com.bgy.thjx.user.model.po.User;
import com.bgy.thjx.user.service.SysUserService;
import com.bgy.thjx.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"成员管理"})
@RequestMapping("/user")
@RestController
public class UserController {


    @Autowired
    SysUserService sysUserService;

    @Autowired
    UserService userService;

    @Autowired
    SysUserMapper sysUserMapper;

    //@ApiOperation("测试接口")

    @GetMapping("/queryUser")
    public  List<User> queryUser(){
        List<User> users = userService.testQueryAllUser();
        return users;
    }

    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") String id){
        String result = userService.testDeleteUser(id);
        return result;
    }

    @PostMapping("/insertUser")
    public  String insertUser(@RequestBody User user){
        //user.setId("1000000");
        String result = userService.testInsertUser(user);
        return result;
    }

    @PostMapping("/updateUser")
    public  String updateUser(@RequestBody User user){
        String result = userService.testUpdateUser(user);
        return result;
    }


//    @GetMapping("/test")
//    public void test(){


//        //测试逻辑删除功能
//        SysUser sysUser = sysUserService.selectById(1);
//
//        //测试分页
//        IPage<SysUser> sysUserIPage = sysUserService.selectPage(new Page<SysUser>(1, 10), new QueryWrapper<>());

        //测试公共字段自动填充
//        SysUser sysUser1 = new SysUser();
//        sysUser1.setUsername("shengbiao");
//        sysUser1.setNickname("shengbaio");
//        sysUser1.setPassword("shengbiao");
////        sysUser1.insert();
////        sysUserMapper.insert(sysUser1);
//        sysUserService.testInsert(sysUser1);

//        //测试乐观锁
//        SysUser sysUser2 = new SysUser();
//        sysUser2.setId(19);
//        sysUser2.setUsername("shen2");
//        sysUser2.setNickname("shen2");
//        sysUser2.setPassword("shen2");
//        sysUser2.setUpdateVersion(1);
//        sysUserService.updateById(sysUser2);
//    }


//    @GetMapping("queryAll")
//    public void queryAll(){
//        SysUser sysUser = new SysUser();
//
//        QueryWrapper<Object> queryWrapper = new QueryWrapper<>();
//        queryWrapper.lambda().eq(SysUser::getNickname)
//        sysUserMapper.selectList()
//
//    }
}
