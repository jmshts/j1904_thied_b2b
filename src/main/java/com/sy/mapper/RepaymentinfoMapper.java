package com.sy.mapper;

import com.sy.pojo.Repaymentinfo;
import com.sy.pojo.RepaymentinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RepaymentinfoMapper {
    int countByExample(RepaymentinfoExample example);

    int deleteByExample(RepaymentinfoExample example);

    int deleteByPrimaryKey(Integer repaymentinfoid);

    int insert(Repaymentinfo record);

    int insertSelective(Repaymentinfo record);

    List<Repaymentinfo> selectByExample(RepaymentinfoExample example);

    Repaymentinfo selectByPrimaryKey(Integer repaymentinfoid);

    int updateByExampleSelective(@Param("record") Repaymentinfo record, @Param("example") RepaymentinfoExample example);

    int updateByExample(@Param("record") Repaymentinfo record, @Param("example") RepaymentinfoExample example);

    int updateByPrimaryKeySelective(Repaymentinfo record);

    int updateByPrimaryKey(Repaymentinfo record);
}