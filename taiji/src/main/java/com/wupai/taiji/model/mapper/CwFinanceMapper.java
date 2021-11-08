package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.CwFinance;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Entity com.wupai.taiji.model.entity.CwFinance
 */
@Mapper
public interface CwFinanceMapper {
    List<CwFinance> selectAllCwFinance();

    int addCwFinance(CwFinance record);//新增财务收支

    List<CwFinance> selectCwFinance(@Param("value") String value, @Param("input") String input);//查询所有财务收支

    int updateCwFinancestate1(CwFinance record);//修改财务收支状态

    int updateCwFinancestate2(CwFinance record);//修改财务收支状态
}




