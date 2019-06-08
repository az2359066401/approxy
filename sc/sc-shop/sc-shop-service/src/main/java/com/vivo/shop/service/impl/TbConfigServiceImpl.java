package com.vivo.shop.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.vivo.mapper.*;
import com.vivo.pojo.*;
import com.vivo.shop.service.TbConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbConfigServiceImpl implements TbConfigService {


    @Autowired
    TbConfigMapper tbConfigMapper;

    @Autowired
    CommentMapper commentMapper;
    @Autowired
    IndexNvdArticleMapper indexNvdArticleMapper;
    @Autowired
    JobBoleArticleMapper jobBoleArticleMapper;
    @Autowired
    JobCnnvdXmlMapper jobCnnvdXmlMapper;
    @Autowired
    JobCnvdArticleMapper jobCnvdArticleMapper;
    @Autowired
    JobCnvdUrlMapper jobCnvdUrlMapper;
    @Autowired
    JobCnvdXmlMapper jobCnvdXmlMapper;
    @Autowired
    JobNvdArticleMapper jobNvdArticleMapper;
    @Autowired
    RoomInfoMapper roomInfoMapper;
    @Autowired
    RoomUrlMapper roomUrlMapper;

    @Autowired
    RedisTemplate redisTemplatex;
    @Autowired
    RedisTemplate stringRedisTemplate;


    public List<TbConfig> findAll(){
        List<TbConfig> tbConfigs = tbConfigMapper.selectByExample(null);
        List<Comment> comment = commentMapper.selectByExample(null);
        List<IndexNvdArticle> indexNvdArticles = indexNvdArticleMapper.selectByExample(null);
        List<JobBoleArticle> jobBoleArticles = jobBoleArticleMapper.selectByExample(null);
        List<JobCnnvdXml> jobCnnvdXmls = jobCnnvdXmlMapper.selectByExample(null);
        List<JobCnvdArticle> jobCnvdArticles = jobCnvdArticleMapper.selectByExample(null);
        List<JobCnvdUrl> jobCnvdUrls = jobCnvdUrlMapper.selectByExample(null);
        List<JobCnvdXml> jobCnvdXmls = jobCnvdXmlMapper.selectByExample(null);
        List<JobNvdArticle> jobNvdArticles = jobNvdArticleMapper.selectByExample(null);
        List<RoomInfo> roomInfos = roomInfoMapper.selectByExample(null);
        List<RoomUrl> roomUrls = roomUrlMapper.selectByExample(null);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("tbConfigs",JSON.toJSONString(tbConfigs));
        jsonObject.put("comment",JSON.toJSONString(comment));
        jsonObject.put("indexNvdArticles",JSON.toJSONString(indexNvdArticles));
        jsonObject.put("jobCnnvdXmls",JSON.toJSONString(jobCnnvdXmls));
        jsonObject.put("jobBoleArticles",JSON.toJSONString(jobBoleArticles));
        jsonObject.put("jobCnvdArticles",JSON.toJSONString(jobCnvdArticles));
        jsonObject.put("jobCnvdUrls",JSON.toJSONString(jobCnvdUrls));
        jsonObject.put("jobCnvdXmls",JSON.toJSONString(jobCnvdXmls));
        jsonObject.put("jobNvdArticles",JSON.toJSONString(jobNvdArticles));
        jsonObject.put("roomInfos",JSON.toJSONString(roomInfos));
        redisTemplatex.opsForValue().set("alljson",JSON.toJSONString(jsonObject));
        return tbConfigs;
    }

}
