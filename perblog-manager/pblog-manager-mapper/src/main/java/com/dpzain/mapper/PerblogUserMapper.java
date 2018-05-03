package com.dpzain.mapper;

import com.dpzain.entity.PerblogUser;
import com.dpzain.entity.PerblogUserExample;
import com.dpzain.entity.PerblogUserWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerblogUserMapper {
    long countByExample(PerblogUserExample example);

    int deleteByExample(PerblogUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerblogUserWithBLOBs record);

    int insertSelective(PerblogUserWithBLOBs record);

    List<PerblogUserWithBLOBs> selectByExampleWithBLOBs(PerblogUserExample example);

    List<PerblogUser> selectByExample(PerblogUserExample example);

    PerblogUserWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerblogUserWithBLOBs record, @Param("example") PerblogUserExample example);

    int updateByExampleWithBLOBs(@Param("record") PerblogUserWithBLOBs record, @Param("example") PerblogUserExample example);

    int updateByExample(@Param("record") PerblogUser record, @Param("example") PerblogUserExample example);

    int updateByPrimaryKeySelective(PerblogUserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PerblogUserWithBLOBs record);

    int updateByPrimaryKey(PerblogUser record);
}