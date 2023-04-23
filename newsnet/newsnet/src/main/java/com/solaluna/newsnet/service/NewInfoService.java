package com.solaluna.newsnet.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.solaluna.newsnet.pojo.NewsInfo;


public interface NewInfoService extends IService<NewsInfo> {
    IPage<NewsInfo>getPage(int pageSize,int pageNum,int tid);
}
