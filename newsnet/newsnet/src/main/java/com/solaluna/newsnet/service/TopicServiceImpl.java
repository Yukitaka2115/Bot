package com.solaluna.newsnet.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.solaluna.newsnet.mapper.TopicMapper;
import com.solaluna.newsnet.pojo.Topic;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements TopicService {
}
