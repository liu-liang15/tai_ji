package com.wupai.taiji.controller.contract;

import com.wupai.taiji.model.entity.HtHeTong;
import com.wupai.taiji.model.service.HtHeTongService;
import com.wupai.taiji.util.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘亮
 * @date 2021年 11月07日9:02
 */
@RestController
public class HtHeTongControll {

    @Resource
    HtHeTongService heTongService;

    /**
     * 查询合同表格的接口
     * @param
     * @return
     */
    @GetMapping("heTong")
    public CommonResult getHeTong(String zhuangTai,String parmt){
        System.err.println(zhuangTai+"==="+parmt);
        List<HtHeTong> heTong1 = heTongService.getHeTong(zhuangTai,parmt);
        return new CommonResult(200,"查询成功！",heTong1);
    }

    @PostMapping("xzHeTong")
    public CommonResult xzht(@RequestBody HtHeTong heTong){

        heTongService.insertHeTong(heTong);

        CommonResult commonResult = new CommonResult(200, "成功");
        return commonResult;
    }




}
