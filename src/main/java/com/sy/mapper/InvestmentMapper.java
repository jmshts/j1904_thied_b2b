package com.sy.mapper;

import com.sy.pojo.Investment;
import com.sy.pojo.InvestmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvestmentMapper {
    int countByExample(InvestmentExample example);

    int deleteByExample(InvestmentExample example);

    int deleteByPrimaryKey(Integer investmentid);

    int insert(Investment record);

    int insertSelective(Investment record);

    List<Investment> selectByExample(InvestmentExample example);

    Investment selectByPrimaryKey(Integer investmentid);

    int updateByExampleSelective(@Param("record") Investment record, @Param("example") InvestmentExample example);

    int updateByExample(@Param("record") Investment record, @Param("example") InvestmentExample example);

    int updateByPrimaryKeySelective(Investment record);

    int updateByPrimaryKey(Investment record);
}