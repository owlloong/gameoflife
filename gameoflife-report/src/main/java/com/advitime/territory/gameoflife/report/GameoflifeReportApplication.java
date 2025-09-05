package com.advitime.territory.gameoflife.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName GameoflifeReportApplication
 * @Description TODO
 * @Author owlloongyuan
 * @Date 2025/7/17 17:17
 * @Version 0.1
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.advitime.territory","com.advitime.dao.natuway"})
public class GameoflifeReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameoflifeReportApplication.class, args);
    }

}
