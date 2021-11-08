package com.wupai.taiji.controller.housing;


import com.wupai.taiji.model.entity.FgOrientation;
import com.wupai.taiji.model.service.FgOrientationService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 易湘君
 * @date 2021年 11月07日10:17
 */
@RestController
@RequestMapping("/orientation")
public class FgOrientationController {
    @Resource
    private FgOrientationService fgOrientationService;

    /**
     * 查询所有房屋朝向
     * @return
     */
    @RequestMapping("/getFgOrientationList")
    public CommonResult getFgOrientationList(){
        List<FgOrientation> fgOrientationList = fgOrientationService.getFgOrientationList();
        return new CommonResult(200,"成功",fgOrientationList);
    }

    /**
     * 新增房屋朝向
     * @param fgOrientation
     * @return
     */
    @PostMapping("/addOrientation")
    public CommonResult addOrientation(@RequestBody FgOrientation fgOrientation){
        if (fgOrientation.getOrientationId()!=null){
            fgOrientationService.updateById(fgOrientation);
        }else {
            fgOrientationService.save(fgOrientation);
            return new CommonResult(200,"成功");
        }
        return new CommonResult(200,"失败");
    }
}