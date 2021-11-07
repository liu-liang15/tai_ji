package com.wupai.taiji.controller.contract;

import com.wupai.taiji.model.entity.HtHeTong;
import com.wupai.taiji.model.service.HtHeTongService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 刘亮
 * @date 2021年 11月07日9:02
 */
@RestController
public class HtHeTongControll {

    @Resource
    HtHeTongService heTongService;

    public CommonResult getHeTong(@RequestBody HtHeTong heTong){
        return heTongService.getHeTong(heTong);
    }


}
