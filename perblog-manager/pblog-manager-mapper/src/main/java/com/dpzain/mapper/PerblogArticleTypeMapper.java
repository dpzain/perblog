package com.dpzain.mapper;

import com.dpzain.entity.PerblogArticleType;
import com.dpzain.entity.PerblogArticleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerblogArticleTypeMapper {
    long countByExample(PerblogArticleTypeExample example);

    int deleteByExample(PerblogArticleTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerblogArticleType record);

    int insertSelective(PerblogArticleType record);

    List<PerblogArticleType> selectByExample(PerblogArticleTypeExample example);

    PerblogArticleType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerblogArticleType record, @Param("example") PerblogArticleTypeExample example);

    int updateByExample(@Param("record") PerblogArticleType record, @Param("example") PerblogArticleTypeExample example);

    int updateByPrimaryKeySelective(PerblogArticleType record);

    int updateByPrimaryKey(PerblogArticleType record);
}