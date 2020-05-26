package com.erjiangao.githubactionsexamples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/api/")
public class MyController {
    @GetMapping("info")
    public Map<String, String> getInfo() {
        return Map.of("msg", "Hello GitHub Actions");
    }
}
