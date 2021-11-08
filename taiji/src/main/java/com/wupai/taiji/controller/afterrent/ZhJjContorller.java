package com.wupai.taiji.controller.afterrent;

import com.wupai.taiji.model.entity.ZhJj;
import com.wupai.taiji.model.service.ZhJjService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wenlijun
 * @date 2021年 11月07日9:32
 */
@RestController
@CrossOrigin
public class ZhJjContorller {
    @Resource
    ZhJjService zhJjService;
    @GetMapping("selectjj")
    public CommonResult selectjj(){
        List<ZhJj> zhJjs =zhJjService.selectjj();
        CommonResult commonResult=new CommonResult(200,"查询成功",zhJjs);
        return commonResult;
    }

}
