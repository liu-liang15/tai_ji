package com.wupai.taiji.controller.afterrent;

import com.wupai.taiji.model.entity.ZhZhuantai;
import com.wupai.taiji.model.service.ZhZhuantaiService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wenlijun
 * @date 2021年 11月06日21:45
 */
@RestController
@CrossOrigin
public class ZhZhuantaiContorller {
    @Resource
    ZhZhuantaiService zhZhuantaiService;
    @GetMapping("selectzt")
    public CommonResult selectgr(){
        List<ZhZhuantai> zhuantais =zhZhuantaiService.selectzhuantai();
        CommonResult commonResult=new CommonResult(200,"查询成功",zhuantais);
        return commonResult;
    }
}
