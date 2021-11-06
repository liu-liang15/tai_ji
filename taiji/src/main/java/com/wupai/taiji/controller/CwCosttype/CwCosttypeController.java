package com.wupai.taiji.controller.CwCosttype;

import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.CwCosttype;
import com.wupai.taiji.model.service.CwCosttypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class CwCosttypeController {
    @Resource
    private CwCosttypeService cwCosttypeService;

    //分页显示所有费用类型
    @GetMapping("/selectAllCwCosttype")
    public PageInfo<CwCosttype> findRuyuanPage(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        return cwCosttypeService.selectAllCwCosttype(currentPage,pagesize);
    }

    //新增费用类型
    @PostMapping("/addCwCosttype")
    public CwCosttype addCwCosttype(@RequestBody CwCosttype cwCosttype){
        cwCosttypeService.addCwCosttype(cwCosttype);
        return cwCosttype;
    }

    //修改费用类型
    @PutMapping("/updateCwCosttype")
    public CwCosttype updateCwCosttype(@RequestBody CwCosttype cwCosttype){
        cwCosttypeService.updateCwCosttype(cwCosttype);
        return cwCosttype;
    }

    //删除费用类型
    @PutMapping("/delCwCosttype")
    public CwCosttype delCwCosttype(@RequestBody CwCosttype cwCosttype){
        cwCosttypeService.delCwCosttype(cwCosttype);
        return cwCosttype;
    }
}
