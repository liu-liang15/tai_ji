package com.wupai.taiji.model.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.CwAccount;
import com.wupai.taiji.model.mapper.CwAccountMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CwAccountService  {
    @Resource
    private CwAccountMapper cwAccountMapper;

    //分页查询所有企业账户
    public PageInfo<CwAccount> selectAllCwAccount(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input){
        PageHelper.startPage(currentPage,pagesize);
        List<CwAccount> entityPage=cwAccountMapper.selectAllCwAccount(value, input);
        PageInfo<CwAccount> classtypePageInfo=new PageInfo<>(entityPage);
        return classtypePageInfo;
    }

    //新增企业账户
    public CwAccount addCwAccount(CwAccount cwAccount) {
        cwAccountMapper.addCwAccount(cwAccount);
        return cwAccount;
    }

    //修改企业账户
    public CwAccount updateCwAccount(CwAccount cwAccount) {
        cwAccountMapper.updateCwAccount(cwAccount);
        return cwAccount;
    }

    //修改企业账户状态
    public CwAccount updateCwAccountState(CwAccount cwAccount) {
        cwAccountMapper.updateCwAccountState(cwAccount);
        return cwAccount;
    }

    //删除企业账户
    public CwAccount delCwAccount(CwAccount cwAccount) {
        cwAccountMapper.delCwAccount(cwAccount);
        return cwAccount;
    }
}
