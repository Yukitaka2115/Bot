package com.solaluna.newsnet.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.solaluna.newsnet.pojo.NewsInfo;
import com.solaluna.newsnet.service.NewInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    NewInfoService service;

    //分页功能
    @GetMapping
    public IPage<NewsInfo>getPage(int size,@RequestParam("cur") int num,@RequestParam("topic") int tid){
        return service.getPage(size, num, tid);
    }

    //删除功能
    @DeleteMapping("/{id}")
    public boolean deletePage(@PathVariable int id){
        return service.removeById(id);
    }

    //更新
    @PutMapping
    public boolean putNew(@RequestBody NewsInfo info){
        System.out.printf(String.valueOf(info));
        return service.updateById(info);
    }
}
