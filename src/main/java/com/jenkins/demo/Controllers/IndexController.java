package com.jenkins.demo.Controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {
    @RequestMapping("/")
    public Map<String, Object> indexJson() {
        // 返回一个 Map 会自动转换为 JSON
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Hello World");
        response.put("status", 200);
        return response;
    }
}