package com.wupai.taiji.controller.afterrent;

import com.wupai.taiji.model.entity.ZhGongren;
import com.wupai.taiji.model.mapper.ZhGongrenMapper;
import com.wupai.taiji.model.service.ZhGongrenService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wenlijun
 * @date 2021年 11月06日17:25
 */
@RestController
public class ZhGongrenContorller {
    @Resource
    ZhGongrenService zhGongrenService;
    @GetMapping("selectzhgr")
    public CommonResult selectzhgr(){
        List<ZhGongren> zhGongrens=zhGongrenService.selectgongren();
        CommonResult commonResult=new CommonResult(200,"查询成功",zhGongrens);
        return commonResult;
    }
}
