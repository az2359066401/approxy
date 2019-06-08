package com.vivo.mapper;

import com.vivo.pojo.JobCnvdXml;
import com.vivo.pojo.JobCnvdXmlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobCnvdXmlMapper {
    long countByExample(JobCnvdXmlExample example);

    int deleteByExample(JobCnvdXmlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobCnvdXml record);

    int insertSelective(JobCnvdXml record);

    List<JobCnvdXml> selectByExample(JobCnvdXmlExample example);

    JobCnvdXml selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobCnvdXml record, @Param("example") JobCnvdXmlExample example);

    int updateByExample(@Param("record") JobCnvdXml record, @Param("example") JobCnvdXmlExample example);

    int updateByPrimaryKeySelective(JobCnvdXml record);

    int updateByPrimaryKey(JobCnvdXml record);
}