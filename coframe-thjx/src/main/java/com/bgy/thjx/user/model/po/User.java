package com.bgy.thjx.user.model.po;


import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User extends Model {
    /**
     * 主键
     */
    @TableId(value = "id",type = IdType.INPUT)
    private String id;
    /**
     * 用户名
     */
    @TableField("employeeName")
    private String employeeName;
    /**
     * 员工编号
     */
    @TableField("employeeCode")
    private String employeeCode;
    /**
     * 证件类型
     */
    @TableField("certificateType")
    private String certificateType;
    /**
     * 证件号
     */
    @TableField("certificateNo")
    private String certificateNo;

    /**
     * 员工类型
     */
    @TableField("userType")
    private String userType;
    /**
     * 等级
     */
    @TableField("level")
    private String level;

    /**
     * 树ID
     */
    @TableField("treeId")
    private String treeId;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                ", certificateType='" + certificateType + '\'' +
                ", certificateNo='" + certificateNo + '\'' +
                ", userType='" + userType + '\'' +
                ", level='" + level + '\'' +
                ", treeId='" + treeId + '\'' +
                '}';
    }


}
