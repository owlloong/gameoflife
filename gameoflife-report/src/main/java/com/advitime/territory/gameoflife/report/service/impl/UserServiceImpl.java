package com.advitime.territory.gameoflife.report.service.impl;

import com.advitime.territory.gameoflife.report.domain.User;
import com.advitime.territory.gameoflife.report.service.IUserService;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author owlloongyuan
 * @Date 2025/8/11 15:54
 * @Version 0.1
 */
public class UserServiceImpl implements IUserService {
    @Override
    public User getUser() {
        User user = new User();
        user.setUserId(1);
        user.setUsername("admin");
        user.setPassword("admin");
        return user;
    }
}
