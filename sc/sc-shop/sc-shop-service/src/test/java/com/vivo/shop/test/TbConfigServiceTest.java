//package com.vivo.shop.test;
//
//import com.alibaba.dubbo.common.utils.StringUtils;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.vivo.mapper.*;
//import com.vivo.pojo.*;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
//@ContextConfiguration(locations={"classpath:spring/applicationContext-redisCluster.xml","classpath:spring/applicationContext-dao.xml"}) //加载配置文件
//public class TbConfigServiceTest {
//
//
//
//
//    @Autowired
//    RedisTemplate redisTemplatex;
//    @Autowired
//    RedisTemplate stringRedisTemplate;
//
//
//    @Autowired
//    TbConfigMapper tbConfigMapper;
//
//    @Autowired
//    CommentMapper commentMapper;
//    @Autowired
//    IndexNvdArticleMapper indexNvdArticleMapper;
//    @Autowired
//    JobBoleArticleMapper jobBoleArticleMapper;
//    @Autowired
//    JobCnnvdXmlMapper jobCnnvdXmlMapper;
//    @Autowired
//    JobCnvdArticleMapper jobCnvdArticleMapper;
//    @Autowired
//    JobCnvdUrlMapper jobCnvdUrlMapper;
//    @Autowired
//    JobCnvdXmlMapper jobCnvdXmlMapper;
//    @Autowired
//    JobNvdArticleMapper jobNvdArticleMapper;
//    @Autowired
//    RoomInfoMapper roomInfoMapper;
//    @Autowired
//    RoomUrlMapper roomUrlMapper;
//
//
//
//    @Test
//    public  void findAll(){
//        Object tbConfigsStr = redisTemplatex.opsForValue().get("alljson");
//        JSONObject jsonObject = new JSONObject();
////        if (tbConfigsStr != null){
////            System.out.println(JSON.toJSONString(tbConfigsStr));
////        }else {
//            List<TbConfig> tbConfigs = tbConfigMapper.selectByExample(null);
//            List<Comment> comment = commentMapper.selectByExample(null);
////            List<IndexNvdArticle> indexNvdArticles = indexNvdArticleMapper.selectByExample(null);
////            List<JobBoleArticle> jobBoleArticles = jobBoleArticleMapper.selectByExample(null);
////            List<JobCnnvdXml> jobCnnvdXmls = jobCnnvdXmlMapper.selectByExample(null);
////            List<JobCnvdArticle> jobCnvdArticles = jobCnvdArticleMapper.selectByExample(null);
////            List<JobCnvdUrl> jobCnvdUrls = jobCnvdUrlMapper.selectByExample(null);
////            List<JobCnvdXml> jobCnvdXmls = jobCnvdXmlMapper.selectByExample(null);
//            List<JobNvdArticle> jobNvdArticles = jobNvdArticleMapper.selectByExample(null);
////            List<RoomInfo> roomInfos = roomInfoMapper.selectByExample(null);
////            List<RoomUrl> roomUrls = roomUrlMapper.selectByExample(null);
//            jsonObject.put("tbConfigs",JSON.toJSONString(tbConfigs));
//            jsonObject.put("comment",JSON.toJSONString(comment));
////            jsonObject.put("indexNvdArticles",JSON.toJSONString(indexNvdArticles));
////            jsonObject.put("jobCnnvdXmls",JSON.toJSONString(jobCnnvdXmls));
////            jsonObject.put("jobBoleArticles",JSON.toJSONString(jobBoleArticles));
////            jsonObject.put("jobCnvdArticles",JSON.toJSONString(jobCnvdArticles));
////            jsonObject.put("jobCnvdUrls",JSON.toJSONString(jobCnvdUrls));
////            jsonObject.put("jobCnvdXmls",JSON.toJSONString(jobCnvdXmls));
//            jsonObject.put("jobNvdArticles",JSON.toJSONString(jobNvdArticles));
////            jsonObject.put("roomInfos",JSON.toJSONString(roomInfos));
//            redisTemplatex.opsForValue().set("alljson",JSON.toJSONString(jsonObject));
//                    System.out.println(JSON.toJSONString(jsonObject));
//
////        }
//    }
//
//    @Test
//    public void test(){
//        Object tbConfigsStr = redisTemplatex.opsForValue().get("tbConfigsStr");
//        System.out.println(JSON.toJSONString(tbConfigsStr));
//    }
//
//
//}
