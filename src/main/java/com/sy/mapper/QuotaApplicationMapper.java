package com.sy.mapper;

import com.sy.pojo.QuotaApplication;
import com.sy.pojo.QuotaApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuotaApplicationMapper {
    int countByExample(QuotaApplicationExample example);

    int deleteByExample(QuotaApplicationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuotaApplication record);

    int insertSelective(QuotaApplication record);

    List<QuotaApplication> selectByExample(QuotaApplicationExample example);

    QuotaApplication selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuotaApplication record, @Param("example") QuotaApplicationExample example);

    int updateByExample(@Param("record") QuotaApplication record, @Param("example") QuotaApplicationExample example);

    int updateByPrimaryKeySelective(QuotaApplication record);

    int updateByPrimaryKey(QuotaApplication record);
}