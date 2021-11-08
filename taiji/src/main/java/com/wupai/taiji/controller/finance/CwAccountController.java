package com.wupai.taiji.controller.finance;

import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.CwAccount;
import com.wupai.taiji.model.service.CwAccountService;
import com.wupai.taiji.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 罗佳豪
 * @date 2021年 11月06日19:37
 */

@RestController
@Slf4j
public class CwAccountController {
    @Resource
    private CwAccountService cwAccountService;

    //分页显示所有企业项目
    @GetMapping("/selectAllCwAccount")
    public PageInfo<CwAccount> selectAllCwAccount(@RequestParam("currentPage") int currentPage, @RequestParam("pagesize") int pagesize,@RequestParam(value = "value",required = false) String value, @RequestParam(value = "input",required = false) String input){
        return cwAccountService.selectAllCwAccount(currentPage,pagesize,value,input);
    }

    //新增企业项目
    @PostMapping("/addCwAccount")
    public CommonResult addCwAccount(@RequestBody CwAccount cwAccount){
        CwAccount cw = cwAccountService.addCwAccount(cwAccount);
        if (cw==null)
            return new CommonResult(200,"账号或密码错误！");
        else
            return new CommonResult(200,"查询成功",cw);
    }

    //修改企业项目
    @PutMapping("/updateCwAccount")
    public CommonResult updateCwAccount(@RequestBody CwAccount cwAccount){
        CwAccount cw = cwAccountService.updateCwAccount(cwAccount);
        if (cw==null)
            return new CommonResult(200,"账号或密码错误！");
        else
            return new CommonResult(200,"查询成功",cw);
    }

    //修改企业项目状态
    @PutMapping("/updateCwAccountState")
    public CommonResult updateCwAccountState(@RequestBody CwAccount cwAccount){
        CwAccount cw = cwAccountService.updateCwAccountState(cwAccount);
        if (cw==null)
            return new CommonResult(200,"账号或密码错误！");
        else
            return new CommonResult(200,"查询成功",cw);
    }

    //删除企业项目
    @PutMapping("/delCwAccount")
    public CommonResult delCwAccount(@RequestBody CwAccount cwAccount){
        CwAccount cw = cwAccountService.delCwAccount(cwAccount);
        if (cw==null)
            return new CommonResult(200,"账号或密码错误！");
        else
            return new CommonResult(200,"查询成功",cw);
    }
}