package com.alibaba.chaosblade.box.service.model.user;

import lombok.Data;

@Data
public class UserRegisterRequest {
    private String isAdmin; // 是否是管理员
    private String userName;
    private String password;
}
