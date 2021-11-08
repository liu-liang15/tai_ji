package com.wupai.taiji.controller.contract;

import com.wupai.taiji.model.entity.HtHuiFang;
import com.wupai.taiji.model.service.HtHuiFangService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘亮
 * @date 2021年 11月08日1:12
 */
@RestController
public class HtHuiFangControll {
    @Resource
    HtHuiFangService htHuiFangService;

    /**
     * 批量回复的方法
     * @param list
     * @return
     */
    @PostMapping("tjhf")
    public CommonResult insertHuiFu(@RequestBody List<HtHuiFang> list){
        System.err.println(list);
        int insert = htHuiFangService.insert(list);
        if (insert==0){
            return new CommonResult(200,"批量回复失败！");
        }
        return new CommonResult(200,"批量回复成功！");
    }

    /**
     * 查询这个合同的调查回访
     * @param htId
     * @return
     */
    @GetMapping("ckhfjl/{htId}")
    public CommonResult ckhf(@PathVariable("htId")String htId ){
        return new CommonResult<List>(200,"成功",htHuiFangService.selectId(htId));
    }

}
