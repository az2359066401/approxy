package com.vivo.mapper;

import com.vivo.pojo.JobBoleArticle;
import com.vivo.pojo.JobBoleArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobBoleArticleMapper {
    long countByExample(JobBoleArticleExample example);

    int deleteByExample(JobBoleArticleExample example);

    int deleteByPrimaryKey(Integer content);

    int insert(JobBoleArticle record);

    int insertSelective(JobBoleArticle record);

    List<JobBoleArticle> selectByExample(JobBoleArticleExample example);

    JobBoleArticle selectByPrimaryKey(Integer content);

    int updateByExampleSelective(@Param("record") JobBoleArticle record, @Param("example") JobBoleArticleExample example);

    int updateByExample(@Param("record") JobBoleArticle record, @Param("example") JobBoleArticleExample example);

    int updateByPrimaryKeySelective(JobBoleArticle record);

    int updateByPrimaryKey(JobBoleArticle record);
}