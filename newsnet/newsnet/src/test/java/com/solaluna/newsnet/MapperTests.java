package com.solaluna.newsnet;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.solaluna.newsnet.mapper.NewsInfoMapper;
import com.solaluna.newsnet.mapper.TopicMapper;
import com.solaluna.newsnet.pojo.NewsInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class MapperTests {
    @Autowired
    public NewsInfoMapper mapper;
    @Autowired
    public TopicMapper mapper1;
    @Test
    void contextLoads() {
    }

    @Test
    public void test1(){
        List<Map<String, Object>> maps = mapper.selectMaps(null);
        maps.forEach(System.out::println);
    }
    @Test
    public void test2(){
        QueryWrapper<NewsInfo> queryWrapper = new QueryWrapper<>();
        Page<NewsInfo> page = new Page<>(1, 2);
        IPage<NewsInfo>iPage = mapper.selectPage(page,queryWrapper);
        System.out.println(iPage.getRecords().size());
    }

    @Test
    public void test3(){
        QueryWrapper<NewsInfo>queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("tid", 2);
        List<NewsInfo> infos = mapper.selectList(queryWrapper);
        infos.forEach(System.out::println);
    }

    @Test
    public void test4(){
        List<Map<String, Object>> maps = mapper1.selectMaps(null);
        maps.forEach(System.out::println);
    }
}
