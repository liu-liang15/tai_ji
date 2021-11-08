package com.wupai.taiji.controller.contract;

import com.wupai.taiji.model.entity.HtRuZhur;
import com.wupai.taiji.model.service.HtRuZhurService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 刘亮
 * @date 2021年 11月08日20:12
 */
@RestController
public class HtRuZhuControll {
    @Resource
    HtRuZhurService htRuZhurService;

    @PostMapping("xgdh")
    public CommonResult xgdh(@RequestBody HtRuZhur htRuZhur){
        int i = htRuZhurService.updateDh(htRuZhur);
        return new CommonResult(200,"成功");
    }

    @GetMapping("sctz/{rzId}")
    public CommonResult scrz(@PathVariable("rzId") String tzId){
        int i = htRuZhurService.deleteRz(tzId);
        return new CommonResult(200,"删除成功！");
    }


}
