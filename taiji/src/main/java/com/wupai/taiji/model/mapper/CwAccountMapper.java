package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.CwAccount;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wupai.taiji.model.entity.CwCosttype;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Entity com.wupai.taiji.model.entity.CwAccount
 */
@Mapper
public interface CwAccountMapper {
    List<CwAccount> selectAllCwAccount();//查询所有企业账户

    int addCwAccount(CwAccount record);//新增企业账户

    int updateCwAccount(CwAccount record);//修改企业账户

    int updateCwAccountState(CwAccount record);//修改企业账户状态

    int delCwAccount(CwAccount record);//删除企业账户
}




