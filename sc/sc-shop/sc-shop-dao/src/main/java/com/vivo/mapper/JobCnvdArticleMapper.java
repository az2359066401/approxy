package com.vivo.mapper;

import com.vivo.pojo.JobCnvdArticle;
import com.vivo.pojo.JobCnvdArticleExample;
import com.vivo.pojo.JobCnvdArticleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobCnvdArticleMapper {
    long countByExample(JobCnvdArticleExample example);

    int deleteByExample(JobCnvdArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobCnvdArticleWithBLOBs record);

    int insertSelective(JobCnvdArticleWithBLOBs record);

    List<JobCnvdArticleWithBLOBs> selectByExampleWithBLOBs(JobCnvdArticleExample example);

    List<JobCnvdArticle> selectByExample(JobCnvdArticleExample example);

    JobCnvdArticleWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobCnvdArticleWithBLOBs record, @Param("example") JobCnvdArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") JobCnvdArticleWithBLOBs record, @Param("example") JobCnvdArticleExample example);

    int updateByExample(@Param("record") JobCnvdArticle record, @Param("example") JobCnvdArticleExample example);

    int updateByPrimaryKeySelective(JobCnvdArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(JobCnvdArticleWithBLOBs record);

    int updateByPrimaryKey(JobCnvdArticle record);
}