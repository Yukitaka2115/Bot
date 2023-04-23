package com.solaluna.newsnet.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Date;

@Data
@TableName("newsinfo")
public class NewsInfo {
    @TableId
    private Integer nid;
    private String title;
    private String author;
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date createDate;
    private String content;
    private Integer tid;
}
