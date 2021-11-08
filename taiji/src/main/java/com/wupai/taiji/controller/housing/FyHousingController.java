package com.wupai.taiji.controller.housing;


import com.wupai.taiji.model.entity.FyHousing;
import com.wupai.taiji.model.service.FyHousingService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 易湘君
 * @date 2021年 11月08日14:35
 */
@RestController
@RequestMapping("/housing")
public class FyHousingController {
    @Resource
    private FyHousingService fyHousingService;

    /**
     * 查询所有房源
     * @return
     */
    @RequestMapping("/getHousingList")
    public CommonResult getHousingList(){
        List<FyHousing> fyHousingList = fyHousingService.getFyHousingList();
        return new CommonResult(200,"成功",fyHousingList);
    }

    /**
     *新增整租房源
     * @param fyHousing
     * @return
     */
    @RequestMapping("/addHousing")
    public CommonResult addHousing(@RequestBody FyHousing fyHousing){
        boolean save = fyHousingService.save(fyHousing);
        if (save){
            return new CommonResult(200,"成功");
        }
        return new CommonResult(200,"成功");
    }

    /**
     * 查询所有的房源和房间
     * @return
     */
    @RequestMapping("/selectHousingList")
    public List<FyHousing> selectHousingList(){

        return fyHousingService.selectHousingList();
    }
}