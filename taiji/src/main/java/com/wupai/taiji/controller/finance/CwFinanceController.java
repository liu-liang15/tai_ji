package com.wupai.taiji.controller.finance;

import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.CwFinance;
import com.wupai.taiji.model.service.CwFinanceService;
import com.wupai.taiji.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 罗佳豪
 * @date 2021年 11月07日21:04
 */

@RestController
@Slf4j
public class CwFinanceController {
    @Resource
    private CwFinanceService cwFinanceService;

    //分页显示所有财务收支
    @GetMapping("/selectAllCwFinance")
    public PageInfo<CwFinance> selectAllCwFinance(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize){
        return cwFinanceService.selectAllCwFinance(currentPage,pagesize);
    }

    //多条件查询财务收支
    @GetMapping("/selectCwFinance")
    public PageInfo<CwFinance> selectCwFinance(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize, @RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input){
        return cwFinanceService.selectCwFinance(currentPage,pagesize,value,input);
    }

    //新增财务收支
    @PostMapping("/addCwFinance")
    public CommonResult addCwFinance(@RequestBody CwFinance cwFinance){
        CwFinance cw = cwFinanceService.addCwFinance(cwFinance);
        if (cw==null)
            return new CommonResult(200,"账号或密码错误！");
        else
            return new CommonResult(200,"查询成功",cw);
    }

    //修改财务收支状态
    @PutMapping("/updateCwFinancestate1")
    public CommonResult updateCwFinancestate1(@RequestBody CwFinance cwFinance){
        CwFinance cw = cwFinanceService.updateCwFinancestate1(cwFinance);
        if (cw==null)
            return new CommonResult(200,"账号或密码错误！");
        else
            return new CommonResult(200,"查询成功",cw);
    }

    //修改财务收支状态
    @PutMapping("/updateCwFinancestate2")
    public CommonResult updateCwFinancestate2(@RequestBody CwFinance cwFinance){
        CwFinance cw = cwFinanceService.updateCwFinancestate2(cwFinance);
        if (cw==null)
            return new CommonResult(200,"账号或密码错误！");
        else
            return new CommonResult(200,"查询成功",cw);
    }
}