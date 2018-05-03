package com.dpzain.mapper;

import com.dpzain.entity.PerlogArticle;
import com.dpzain.entity.PerlogArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerlogArticleMapper {
    long countByExample(PerlogArticleExample example);

    int deleteByExample(PerlogArticleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PerlogArticle record);

    int insertSelective(PerlogArticle record);

    List<PerlogArticle> selectByExampleWithBLOBs(PerlogArticleExample example);

    List<PerlogArticle> selectByExample(PerlogArticleExample example);

    PerlogArticle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PerlogArticle record, @Param("example") PerlogArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") PerlogArticle record, @Param("example") PerlogArticleExample example);

    int updateByExample(@Param("record") PerlogArticle record, @Param("example") PerlogArticleExample example);

    int updateByPrimaryKeySelective(PerlogArticle record);

    int updateByPrimaryKeyWithBLOBs(PerlogArticle record);

    int updateByPrimaryKey(PerlogArticle record);
}