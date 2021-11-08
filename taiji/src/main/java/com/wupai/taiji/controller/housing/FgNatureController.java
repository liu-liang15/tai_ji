package com.wupai.taiji.controller.housing;


import com.wupai.taiji.model.entity.FgNature;
import com.wupai.taiji.model.service.FgNatureService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 易湘君
 * @date 2021年 11月07日9:35
 */
@RestController
@RequestMapping("/nature")
public class FgNatureController {
    @Resource
    private FgNatureService fgNatureService;

    /**
     * 查询所有房屋性质
     * @return
     */
    @RequestMapping("/getFgNatureList")
    public CommonResult getFgNatureList(){
        List<FgNature> fgNatureList = fgNatureService.getFgNatureList();
        return new CommonResult(200,"成功",fgNatureList);
    }

    @PostMapping("/addFgNature")
    public CommonResult addFgNature(@RequestBody FgNature fgNature){
        if (fgNature.getNatureId()!=null){
            fgNatureService.updateById(fgNature);
        }else {
            fgNatureService.save(fgNature);
            return new CommonResult(200,"成功");
        }
        return new CommonResult(200,"失败");
    }
}