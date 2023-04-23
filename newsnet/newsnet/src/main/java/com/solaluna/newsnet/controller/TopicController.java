package com.solaluna.newsnet.controller;

import com.solaluna.newsnet.pojo.Topic;
import com.solaluna.newsnet.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topic")
public class TopicController {
    @Autowired
    TopicService service;
    @GetMapping
    public List<Topic> getTopic(){
        return service.list();
    }
}
