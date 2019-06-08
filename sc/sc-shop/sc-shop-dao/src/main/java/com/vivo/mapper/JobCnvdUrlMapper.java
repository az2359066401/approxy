package com.vivo.mapper;

import com.vivo.pojo.JobCnvdUrl;
import com.vivo.pojo.JobCnvdUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobCnvdUrlMapper {
    long countByExample(JobCnvdUrlExample example);

    int deleteByExample(JobCnvdUrlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobCnvdUrl record);

    int insertSelective(JobCnvdUrl record);

    List<JobCnvdUrl> selectByExample(JobCnvdUrlExample example);

    JobCnvdUrl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobCnvdUrl record, @Param("example") JobCnvdUrlExample example);

    int updateByExample(@Param("record") JobCnvdUrl record, @Param("example") JobCnvdUrlExample example);

    int updateByPrimaryKeySelective(JobCnvdUrl record);

    int updateByPrimaryKey(JobCnvdUrl record);
}