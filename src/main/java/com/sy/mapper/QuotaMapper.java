package com.sy.mapper;

import com.sy.pojo.Quota;
import com.sy.pojo.QuotaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuotaMapper {
    int countByExample(QuotaExample example);

    int deleteByExample(QuotaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Quota record);

    int insertSelective(Quota record);

    List<Quota> selectByExample(QuotaExample example);

    Quota selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Quota record, @Param("example") QuotaExample example);

    int updateByExample(@Param("record") Quota record, @Param("example") QuotaExample example);

    int updateByPrimaryKeySelective(Quota record);

    int updateByPrimaryKey(Quota record);
}