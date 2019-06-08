package com.vivo.mapper;

import com.vivo.pojo.TbProvinces;
import com.vivo.pojo.TbProvincesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProvincesMapper {
    long countByExample(TbProvincesExample example);

    int deleteByExample(TbProvincesExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbProvinces record);

    int insertSelective(TbProvinces record);

    List<TbProvinces> selectByExample(TbProvincesExample example);

    TbProvinces selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbProvinces record, @Param("example") TbProvincesExample example);

    int updateByExample(@Param("record") TbProvinces record, @Param("example") TbProvincesExample example);

    int updateByPrimaryKeySelective(TbProvinces record);

    int updateByPrimaryKey(TbProvinces record);
}