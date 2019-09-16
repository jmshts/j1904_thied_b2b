package com.sy.mapper;

import com.sy.pojo.RepaymentMethod;
import com.sy.pojo.RepaymentMethodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepaymentMethodMapper {
    int countByExample(RepaymentMethodExample example);

    int deleteByExample(RepaymentMethodExample example);

    int deleteByPrimaryKey(Integer repaymentid);

    int insert(RepaymentMethod record);

    int insertSelective(RepaymentMethod record);

    List<RepaymentMethod> selectByExample(RepaymentMethodExample example);

    RepaymentMethod selectByPrimaryKey(Integer repaymentid);

    int updateByExampleSelective(@Param("record") RepaymentMethod record, @Param("example") RepaymentMethodExample example);

    int updateByExample(@Param("record") RepaymentMethod record, @Param("example") RepaymentMethodExample example);

    int updateByPrimaryKeySelective(RepaymentMethod record);

    int updateByPrimaryKey(RepaymentMethod record);
}