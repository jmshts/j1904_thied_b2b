package com.sy.mapper;

import com.sy.pojo.Loantype;
import com.sy.pojo.LoantypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoantypeMapper {
    int countByExample(LoantypeExample example);

    int deleteByExample(LoantypeExample example);

    int deleteByPrimaryKey(Integer loantypeid);

    int insert(Loantype record);

    int insertSelective(Loantype record);

    List<Loantype> selectByExample(LoantypeExample example);

    Loantype selectByPrimaryKey(Integer loantypeid);

    int updateByExampleSelective(@Param("record") Loantype record, @Param("example") LoantypeExample example);

    int updateByExample(@Param("record") Loantype record, @Param("example") LoantypeExample example);

    int updateByPrimaryKeySelective(Loantype record);

    int updateByPrimaryKey(Loantype record);
}