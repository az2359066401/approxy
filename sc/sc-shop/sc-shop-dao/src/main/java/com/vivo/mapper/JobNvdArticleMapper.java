package com.vivo.mapper;

import com.vivo.pojo.JobNvdArticle;
import com.vivo.pojo.JobNvdArticleExample;
import com.vivo.pojo.JobNvdArticleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobNvdArticleMapper {
    long countByExample(JobNvdArticleExample example);

    int deleteByExample(JobNvdArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobNvdArticleWithBLOBs record);

    int insertSelective(JobNvdArticleWithBLOBs record);

    List<JobNvdArticleWithBLOBs> selectByExampleWithBLOBs(JobNvdArticleExample example);

    List<JobNvdArticle> selectByExample(JobNvdArticleExample example);

    JobNvdArticleWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobNvdArticleWithBLOBs record, @Param("example") JobNvdArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") JobNvdArticleWithBLOBs record, @Param("example") JobNvdArticleExample example);

    int updateByExample(@Param("record") JobNvdArticle record, @Param("example") JobNvdArticleExample example);

    int updateByPrimaryKeySelective(JobNvdArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(JobNvdArticleWithBLOBs record);

    int updateByPrimaryKey(JobNvdArticle record);
}