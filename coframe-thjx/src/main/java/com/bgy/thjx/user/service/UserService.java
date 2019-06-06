package com.bgy.thjx.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgy.thjx.user.model.po.SysUser;
import com.bgy.thjx.user.model.po.User;

import java.util.List;

/**
 * <p>
 * 用户 服务类
 * </p>
 *
 * @author shen
 * @since 2018-07-16
 */
public interface UserService extends IService<User> {


    public List<User> testQueryAllUser();

    public String testDeleteUser(String id);

    public String testInsertUser(User user);

    public String testUpdateUser(User user);
}
