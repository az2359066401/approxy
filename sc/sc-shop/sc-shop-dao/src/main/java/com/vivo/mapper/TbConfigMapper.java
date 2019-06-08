package com.vivo.mapper;

import com.vivo.pojo.TbConfig;
import com.vivo.pojo.TbConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbConfigMapper {
    long countByExample(TbConfigExample example);

    int deleteByExample(TbConfigExample example);

    int deleteByPrimaryKey(String cfgCode);

    int insert(TbConfig record);

    int insertSelective(TbConfig record);

    List<TbConfig> selectByExample(TbConfigExample example);

    TbConfig selectByPrimaryKey(String cfgCode);

    int updateByExampleSelective(@Param("record") TbConfig record, @Param("example") TbConfigExample example);

    int updateByExample(@Param("record") TbConfig record, @Param("example") TbConfigExample example);

    int updateByPrimaryKeySelective(TbConfig record);

    int updateByPrimaryKey(TbConfig record);
}