package com.vivo.mapper;

import com.vivo.pojo.RoomInfo;
import com.vivo.pojo.RoomInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomInfoMapper {
    long countByExample(RoomInfoExample example);

    int deleteByExample(RoomInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoomInfo record);

    int insertSelective(RoomInfo record);

    List<RoomInfo> selectByExample(RoomInfoExample example);

    RoomInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoomInfo record, @Param("example") RoomInfoExample example);

    int updateByExample(@Param("record") RoomInfo record, @Param("example") RoomInfoExample example);

    int updateByPrimaryKeySelective(RoomInfo record);

    int updateByPrimaryKey(RoomInfo record);
}