package com.wupai.taiji.controller.housing;


import com.wupai.taiji.model.entity.FgFitment;
import com.wupai.taiji.model.service.FgFitmentService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 易湘君
 * @date 2021年 11月07日9:08
 */
@RestController
@RequestMapping("/fitment")
public class FgFitmentController {
    @Resource
    private FgFitmentService fgFitmentService;

    /**
     * 查询所有房间装修类型数据
     * @return
     */
    @RequestMapping("/getFgFitmentList")
    public CommonResult getFgFitmentList(){
        List<FgFitment> fgFitmentList = fgFitmentService.getFgFitmentList();
        return new CommonResult(200,"成功",fgFitmentList);
    }

    /**
     * 新增房屋装修类型
     * @param fgFitment
     * @return
     */
    @PostMapping("/addFgFitment")
    public CommonResult addFgFitment(@RequestBody FgFitment fgFitment){
        if (fgFitment.getFitmentId()!=null){
            fgFitmentService.updateById(fgFitment);
        }else {
            fgFitmentService.save(fgFitment);
            return new CommonResult(200,"成功");
        }
        return new CommonResult(200,"失败");
    }


}