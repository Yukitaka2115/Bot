package com.solaluna.newsnet;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.solaluna.newsnet.pojo.NewsInfo;
import com.solaluna.newsnet.service.NewInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;

@SpringBootTest
class ServiceTests {
    @Autowired
    NewInfoService service;

    @Test
    public void test1(){
        List<NewsInfo> infos = service.list();
        infos.forEach(System.out::println);
    }

    @Test
    public void test2(){
        IPage<NewsInfo> page = service.getPage(1, 5, 2);
        System.out.println(page);
    }

    @Test
    public void test3(){
        NewsInfo newsInfo = new NewsInfo();
        newsInfo.setTid(5);
        newsInfo.setAuthor("111");
        newsInfo.setCreateDate(new Date(2022-10-11));
        newsInfo.setNid(1);
        newsInfo.setContent("wqerweqrfweqrf");
        service.updateById(newsInfo);
    }
}
