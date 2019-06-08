package com.vivo.mapper;

import com.vivo.pojo.JobCnnvdXml;
import com.vivo.pojo.JobCnnvdXmlExample;
import com.vivo.pojo.JobCnnvdXmlWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobCnnvdXmlMapper {
    long countByExample(JobCnnvdXmlExample example);

    int deleteByExample(JobCnnvdXmlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobCnnvdXmlWithBLOBs record);

    int insertSelective(JobCnnvdXmlWithBLOBs record);

    List<JobCnnvdXmlWithBLOBs> selectByExampleWithBLOBs(JobCnnvdXmlExample example);

    List<JobCnnvdXml> selectByExample(JobCnnvdXmlExample example);

    JobCnnvdXmlWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobCnnvdXmlWithBLOBs record, @Param("example") JobCnnvdXmlExample example);

    int updateByExampleWithBLOBs(@Param("record") JobCnnvdXmlWithBLOBs record, @Param("example") JobCnnvdXmlExample example);

    int updateByExample(@Param("record") JobCnnvdXml record, @Param("example") JobCnnvdXmlExample example);

    int updateByPrimaryKeySelective(JobCnnvdXmlWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(JobCnnvdXmlWithBLOBs record);

    int updateByPrimaryKey(JobCnnvdXml record);
}