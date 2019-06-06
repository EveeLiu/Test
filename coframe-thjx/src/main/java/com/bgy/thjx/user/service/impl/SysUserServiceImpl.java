package com.bgy.thjx.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bgy.thjx.user.mapper.SysUserMapper;
import com.bgy.thjx.user.model.po.SysUser;
import com.bgy.thjx.user.service.SysUserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author oceanzhang
 * @since 2019-05-23
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    public void testInsert(SysUser user) {

        ////

        System.out.println("彪哥好帅");
        baseMapper.insert(user);
    }

    public List<SysUser> testQueryAllUser() {

        List<SysUser> sysUsers = baseMapper.selectList(null);
        if (sysUsers.size() > 0) {
            for (SysUser s : sysUsers) {
                System.out.println(s);
            }

        }
        System.out.println("彪哥好帅2");
        return null;
    }


}
