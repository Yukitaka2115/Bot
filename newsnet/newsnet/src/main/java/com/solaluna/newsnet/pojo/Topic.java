package com.solaluna.newsnet.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Topic {
    @TableId
    private Integer tid;
    private String name;
}

