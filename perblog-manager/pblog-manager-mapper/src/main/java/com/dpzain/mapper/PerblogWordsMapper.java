package com.dpzain.mapper;

import com.dpzain.entity.PerblogWords;
import com.dpzain.entity.PerblogWordsExample;
import com.dpzain.entity.PerblogWordsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerblogWordsMapper {
    long countByExample(PerblogWordsExample example);

    int deleteByExample(PerblogWordsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerblogWordsWithBLOBs record);

    int insertSelective(PerblogWordsWithBLOBs record);

    List<PerblogWordsWithBLOBs> selectByExampleWithBLOBs(PerblogWordsExample example);

    List<PerblogWords> selectByExample(PerblogWordsExample example);

    PerblogWordsWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerblogWordsWithBLOBs record, @Param("example") PerblogWordsExample example);

    int updateByExampleWithBLOBs(@Param("record") PerblogWordsWithBLOBs record, @Param("example") PerblogWordsExample example);

    int updateByExample(@Param("record") PerblogWords record, @Param("example") PerblogWordsExample example);

    int updateByPrimaryKeySelective(PerblogWordsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PerblogWordsWithBLOBs record);

    int updateByPrimaryKey(PerblogWords record);
}