package com.dpzain.mapper;

import com.dpzain.entity.PerblogComments;
import com.dpzain.entity.PerblogCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerblogCommentsMapper {
    long countByExample(PerblogCommentsExample example);

    int deleteByExample(PerblogCommentsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerblogComments record);

    int insertSelective(PerblogComments record);

    List<PerblogComments> selectByExampleWithBLOBs(PerblogCommentsExample example);

    List<PerblogComments> selectByExample(PerblogCommentsExample example);

    PerblogComments selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerblogComments record, @Param("example") PerblogCommentsExample example);

    int updateByExampleWithBLOBs(@Param("record") PerblogComments record, @Param("example") PerblogCommentsExample example);

    int updateByExample(@Param("record") PerblogComments record, @Param("example") PerblogCommentsExample example);

    int updateByPrimaryKeySelective(PerblogComments record);

    int updateByPrimaryKeyWithBLOBs(PerblogComments record);

    int updateByPrimaryKey(PerblogComments record);
}