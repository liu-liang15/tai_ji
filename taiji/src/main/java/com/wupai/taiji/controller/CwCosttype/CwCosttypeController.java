package com.wupai.taiji.controller.CwCosttype;

import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.CwCosttype;
import com.wupai.taiji.model.service.CwCosttypeService;
import com.wupai.taiji.util.CommonResult;
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
    public PageInfo<CwCosttype> selectAllCwCosttype(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        return cwCosttypeService.selectAllCwCosttype(currentPage,pagesize);
    }

    //新增费用类型
    @PostMapping("/addCwCosttype")
    public CommonResult addCwCosttype(@RequestBody CwCosttype cwCosttype){
        CwCosttype cw = cwCosttypeService.addCwCosttype(cwCosttype);
        if (cw==null)
            return new CommonResult(200,"账号或密码错误！");
        else
            return new CommonResult(200,"查询成功",cw);
    }

    //修改费用类型
    @PutMapping("/updateCwCosttype")
    public CommonResult updateCwCosttype(@RequestBody CwCosttype cwCosttype){
        CwCosttype cw = cwCosttypeService.updateCwCosttype(cwCosttype);
        if (cw==null)
            return new CommonResult(200,"账号或密码错误！");
        else
            return new CommonResult(200,"查询成功",cw);
    }

    //删除费用类型
    @PutMapping("/delCwCosttype")
    public CommonResult delCwCosttype(@RequestBody CwCosttype cwCosttype){
        CwCosttype cw = cwCosttypeService.delCwCosttype(cwCosttype);
        if (cw==null)
            return new CommonResult(200,"账号或密码错误！");
        else
            return new CommonResult(200,"查询成功",cw);
    }
}
