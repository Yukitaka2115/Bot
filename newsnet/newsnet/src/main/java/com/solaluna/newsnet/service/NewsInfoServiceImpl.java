package com.solaluna.newsnet.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.solaluna.newsnet.mapper.NewsInfoMapper;
import com.solaluna.newsnet.pojo.NewsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsInfoServiceImpl extends ServiceImpl<NewsInfoMapper, NewsInfo> implements NewInfoService {
    @Autowired
    private NewsInfoMapper mapper;
    /**
     * 分页功能整合条件查询
     */
    public IPage<NewsInfo>getPage(int pageSize,int pageNum,int tid){
        IPage<NewsInfo> page = new Page<>(pageNum, pageSize);
        QueryWrapper<NewsInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("tid", tid);
        mapper.selectPage(page,tid==0?null:queryWrapper);
        return page;
    }
}
