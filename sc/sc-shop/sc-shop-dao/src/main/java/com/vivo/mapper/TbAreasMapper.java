package com.vivo.mapper;

import com.vivo.pojo.TbAreas;
import com.vivo.pojo.TbAreasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAreasMapper {
    long countByExample(TbAreasExample example);

    int deleteByExample(TbAreasExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbAreas record);

    int insertSelective(TbAreas record);

    List<TbAreas> selectByExample(TbAreasExample example);

    TbAreas selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbAreas record, @Param("example") TbAreasExample example);

    int updateByExample(@Param("record") TbAreas record, @Param("example") TbAreasExample example);

    int updateByPrimaryKeySelective(TbAreas record);

    int updateByPrimaryKey(TbAreas record);
}