package com.vivo.mapper;

import com.vivo.pojo.IndexNvdArticle;
import com.vivo.pojo.IndexNvdArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndexNvdArticleMapper {
    long countByExample(IndexNvdArticleExample example);

    int deleteByExample(IndexNvdArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndexNvdArticle record);

    int insertSelective(IndexNvdArticle record);

    List<IndexNvdArticle> selectByExample(IndexNvdArticleExample example);

    IndexNvdArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndexNvdArticle record, @Param("example") IndexNvdArticleExample example);

    int updateByExample(@Param("record") IndexNvdArticle record, @Param("example") IndexNvdArticleExample example);

    int updateByPrimaryKeySelective(IndexNvdArticle record);

    int updateByPrimaryKey(IndexNvdArticle record);
}