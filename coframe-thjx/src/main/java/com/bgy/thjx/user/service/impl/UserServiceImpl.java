package com.bgy.thjx.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bgy.thjx.user.mapper.SysUserMapper;
import com.bgy.thjx.user.mapper.UserMapper;
import com.bgy.thjx.user.model.po.SysUser;
import com.bgy.thjx.user.model.po.User;
import com.bgy.thjx.user.service.SysUserService;
import com.bgy.thjx.user.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {



    public List<User> testQueryAllUser() {

        List<User> users = baseMapper.selectList(null);
        if (users.size() > 0) {
            for (User s : users) {
                System.out.println(s);
            }
        }
        return users;
    }

    public String testDeleteUser(String id){
        int i = baseMapper.deleteById(id);
        if (i>0){
            return "删除成功！";
        }
        return "删除失败！";
    }

    public String testInsertUser(User user){
        int i = baseMapper.insert(user);
        if (i>0){
            return "新增用户成功！";
        }
        return "新增用户失败！";
    }

    public String testUpdateUser(User user){
        int i = baseMapper.updateById(user);
        if (i>0){
            return "修改用户成功！";
        }
        return "修改用户失败！";
    }


}
