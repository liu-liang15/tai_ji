package com.wupai.taiji.model.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.CwCosttype;
import com.wupai.taiji.model.mapper.CwCosttypeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CwCosttypeService {
    @Resource
    private CwCosttypeMapper cwCosttypeMapper;

    //分页查询所有费用类型
    public PageInfo<CwCosttype> selectAllCwCosttype(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<CwCosttype> entityPage=cwCosttypeMapper.selectAllCwCosttype();
        PageInfo<CwCosttype> classtypePageInfo=new PageInfo<>(entityPage);
        return classtypePageInfo;
    }

    //新增费用类型
    public CwCosttype addCwCosttype(CwCosttype cwCosttype) {
        cwCosttypeMapper.addCwCosttype(cwCosttype);
        return cwCosttype;
    }

    //修改费用类型
    public CwCosttype updateCwCosttype(CwCosttype cwCosttype) {
        cwCosttypeMapper.updateCwCosttype(cwCosttype);
        return cwCosttype;
    }

    //删除费用类型
    public CwCosttype delCwCosttype(CwCosttype cwCosttype) {
        cwCosttypeMapper.delCwCosttype(cwCosttype);
        return cwCosttype;
    }
}
