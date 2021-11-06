package com.wupai.taiji.controller.contract;

import com.wupai.taiji.model.entity.HtYuanGo;
import com.wupai.taiji.model.service.HtYuanGoService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

/**
 * @author 刘亮
 * @date 2021年 11月06日15:50
 */
@RestController
public class UserControll {
    @Resource
    HtYuanGoService htYuanGoService;

    @PostMapping("getUser")
    public CommonResult getUser(@RequestBody HtYuanGo yuanGo){
        HtYuanGo user = htYuanGoService.getUser(yuanGo);
        if (user==null)
            return new CommonResult(201,"账号或密码错误！");
        else
            return new CommonResult(200,"查询成功",user);
    }
}
