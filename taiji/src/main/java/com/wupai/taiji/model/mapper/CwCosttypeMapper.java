package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.CwCosttype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CwCosttypeMapper {
    List<CwCosttype> selectAllCwCosttype();//查询所有费用类型

    int addCwCosttype(CwCosttype record);//新增费用类型

    int updateCwCosttype(CwCosttype record);//修改费用类型

    int delCwCosttype(CwCosttype record);//删除费用类型
}