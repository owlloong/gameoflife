package com.advitime.territory.gameoflife.report.config;

import com.advitime.territory.gameoflife.report.service.IUserService;
import com.advitime.territory.gameoflife.report.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ReportConfiguration
 * @Description TODO
 * @Author owlloongyuan
 * @Date 2025/8/11 16:04
 * @Version 0.1
 */
@Configuration
public class ReportConfiguration {

    @Bean
    public IUserService userService() {
        return new UserServiceImpl();
    }
}
