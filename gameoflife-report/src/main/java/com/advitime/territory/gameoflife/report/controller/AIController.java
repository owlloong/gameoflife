package com.advitime.territory.gameoflife.report.controller;

import com.advitime.dao.natuway.ai.entity.AIBaseEntity;
import com.advitime.dao.natuway.ai.entity.AIResponse;
import com.advitime.dao.natuway.ai.service.DeepSeekService;
import com.advitime.dao.natuway.core.utils.JsonUtils;
import com.advitime.territory.gameoflife.report.domain.User;
import com.advitime.territory.gameoflife.report.service.IUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName AIController
 * @Description TODO
 * @Author owlloongyuan
 * @Date 2025/7/17 18:15
 * @Version 0.1
 */
@RestController
@RequestMapping("/ai")
public class AIController {

    @Resource
    private DeepSeekService deepSeekService;
    @Resource
    private IUserService userService;

    @PostMapping("/get")
    public String get(@RequestBody AIBaseEntity aiBaseEntity) {
        String chatResponse = deepSeekService.getChatResponse(aiBaseEntity.getPrompt());
        System.out.println(chatResponse);
        AIResponse aiResponse = JsonUtils.readValue(chatResponse, AIResponse.class);
        return aiResponse.getChoices().get(0).getMessage().getContent();
    }

    @PostMapping("/user")
    public User getUser() {
        return userService.getUser();
    }

}
