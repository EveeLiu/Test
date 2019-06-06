package com.bgy.thjx.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bgy.thjx.user.model.po.SysUser;

import java.util.List;

/**
 * <p>
 * 用户 服务类
 * </p>
 *
 * @author shen
 * @since 2018-07-16
 */
public interface SysUserService extends IService<SysUser> {

    public void testInsert(SysUser user);

    public List<SysUser> testQueryAllUser();
}
