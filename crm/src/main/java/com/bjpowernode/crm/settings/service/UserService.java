package com.bjpowernode.crm.settings.service;

import com.bjpowernode.crm.settings.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface UserService {
    User queryUserByLoginActAndPwd(Map<String, Object> map);
    List<User> queryAllUsers();
}
