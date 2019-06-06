package com.bgy.thjx.user.model.po;


import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysUser extends Model {
    /**
     * 主键
     */
    @TableId("id")
    private Integer id;
    /**
     * 用户名
     */
    @TableField("username")
    private String username;
    /**
     * 别名
     */
    @TableField("nickname")
    private String nickname;
    /**
     * 密码
     */
    @TableField("password")
    private String password;
    /**
     * 权限id
     */
    @TableField("role_id")
    private Integer roleId;

    /**
     * 权限名称
     */
    @TableField(exist = false)
    private String roleName;
    /**
     * 部门id
     */
    @TableField("dept_id")
    private Integer deptId;

    /**
     * 部门名称
     */
    @TableField(exist = false)
    private String deptName;
    /**
     * 创建时间
     */
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    /**
     * 备注
     */
    @TableField("remark")
    private String remark;
    /**
     * 是否删除(0:未删除 1:已删除)
     */
    @TableField("deleted")
    @TableLogic
    private Integer deleted;
    /**
     * 邮件
     */
    @TableField("email")
    private String email;
    /**
     * 电话
     */
    @TableField("phone")
    private String phone;
    /**
     * 乐观锁
     */
    @Version
    @TableField("update_version")
    private Integer updateVersion;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }


    @Override
    public String toString() {
        return "SysUser{" +
                ", id=" + id +
                ", username=" + username +
                ", nickname=" + nickname +
                ", password=" + password +
                ", roleId=" + roleId +
                ", deptId=" + deptId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", remark=" + remark +
                ", deleted=" + deleted +
                ", email=" + email +
                ", phone=" + phone +
                ", updateVersion=" + updateVersion +
                "}";
    }



}
