package com.wupai.taiji.controller.housing;

import com.wupai.taiji.model.entity.FgFeature;
import com.wupai.taiji.model.service.FgFeatureService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 易湘君
 * @date 2021年 11月07日11:04
 */
@RestController
@RequestMapping("/fgfeature")
public class FgFeatureController {
    @Resource
    private FgFeatureService fgFeatureService;

    /**
     * 查询所有房屋特色
     * @return
     */
    @RequestMapping("/getFgFeatureList")
    public CommonResult getFgFeatureList(){
        List<FgFeature> fgFeatureList = fgFeatureService.getFgFeatureList();
        return new CommonResult(200,"成功",fgFeatureList);
    }

    /**
     * 新增房屋特色或编辑
     * @param fgFeature
     * @return
     */
    @PostMapping("/addFgFeature")
    public CommonResult addFgFeature(@RequestBody FgFeature fgFeature){
        if (fgFeature.getFeatureId()!=null){
            fgFeatureService.updateById(fgFeature);
        }else {
            fgFeatureService.save(fgFeature);
            return new CommonResult(200,"成功");
        }
        return new CommonResult(200,"失败");
    }
}