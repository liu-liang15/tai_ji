package com.wupai.taiji.model.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.CwFinance;
import com.wupai.taiji.model.mapper.CwFinanceMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Service
@Transactional
public class CwFinanceService {
    @Resource
    private CwFinanceMapper cwFinanceMapper;

    //分页查询所有财务收支
    public PageInfo<CwFinance> selectAllCwFinance(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<CwFinance> entityPage=cwFinanceMapper.selectAllCwFinance();
        PageInfo<CwFinance> classtypePageInfo1=new PageInfo<>(entityPage);
        return classtypePageInfo1;
    }

    //多条件查询财务收支
    public PageInfo<CwFinance> selectCwFinance(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input){
        PageHelper.startPage(currentPage,pagesize);
        List<CwFinance> entityPage=cwFinanceMapper.selectCwFinance(value, input);
        PageInfo<CwFinance> classtypePageInfo=new PageInfo<>(entityPage);
        return classtypePageInfo;
    }

    //新增财务收支
    public CwFinance addCwFinance(CwFinance cwFinance) {
        cwFinance.setBudgetsTime(new Date());
        cwFinance.setRzId("20001");
        cwFinanceMapper.addCwFinance(cwFinance);
        return cwFinance;
    }

    //修改财务收支状态
    public CwFinance updateCwFinancestate1(CwFinance cwFinance) {
        cwFinance.setBudgetsTime(new Date());
        cwFinanceMapper.updateCwFinancestate1(cwFinance);
        return cwFinance;
    }

    //修改财务收支状态
    public CwFinance updateCwFinancestate2(CwFinance cwFinance) {
        cwFinanceMapper.updateCwFinancestate2(cwFinance);
        return cwFinance;
    }
}
