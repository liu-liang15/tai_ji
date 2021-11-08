package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.CwAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Entity com.wupai.taiji.model.entity.CwAccount
 */
@Mapper
public interface CwAccountMapper {
    List<CwAccount> selectAllCwAccount(@Param("value") String value,@Param("input") String input);//查询所有企业账户

    int addCwAccount(CwAccount record);//新增企业账户

    int updateCwAccount(CwAccount record);//修改企业账户

    int updateCwAccountState(CwAccount record);//修改企业账户状态

    int delCwAccount(CwAccount record);//删除企业账户

    List<CwAccount>seCountMes();//查询账户基本信息
}




