package com.dpzain.mapper;

import com.dpzain.entity.PerblogCommentsBack;
import com.dpzain.entity.PerblogCommentsBackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerblogCommentsBackMapper {
    long countByExample(PerblogCommentsBackExample example);

    int deleteByExample(PerblogCommentsBackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerblogCommentsBack record);

    int insertSelective(PerblogCommentsBack record);

    List<PerblogCommentsBack> selectByExampleWithBLOBs(PerblogCommentsBackExample example);

    List<PerblogCommentsBack> selectByExample(PerblogCommentsBackExample example);

    PerblogCommentsBack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerblogCommentsBack record, @Param("example") PerblogCommentsBackExample example);

    int updateByExampleWithBLOBs(@Param("record") PerblogCommentsBack record, @Param("example") PerblogCommentsBackExample example);

    int updateByExample(@Param("record") PerblogCommentsBack record, @Param("example") PerblogCommentsBackExample example);

    int updateByPrimaryKeySelective(PerblogCommentsBack record);

    int updateByPrimaryKeyWithBLOBs(PerblogCommentsBack record);

    int updateByPrimaryKey(PerblogCommentsBack record);
}