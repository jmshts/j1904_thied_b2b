package com.sy.mapper;

import com.sy.pojo.QuotaRecord;
import com.sy.pojo.QuotaRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuotaRecordMapper {
    int countByExample(QuotaRecordExample example);

    int deleteByExample(QuotaRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QuotaRecord record);

    int insertSelective(QuotaRecord record);

    List<QuotaRecord> selectByExample(QuotaRecordExample example);

    QuotaRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QuotaRecord record, @Param("example") QuotaRecordExample example);

    int updateByExample(@Param("record") QuotaRecord record, @Param("example") QuotaRecordExample example);

    int updateByPrimaryKeySelective(QuotaRecord record);

    int updateByPrimaryKey(QuotaRecord record);
}