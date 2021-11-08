package com.wupai.taiji.controller.contract;

import com.wupai.taiji.model.entity.HtHeTong;
import com.wupai.taiji.model.service.HtHeTongService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("heTong")
    public CommonResult getHeTong(){
        List<HtHeTong> heTong1 = heTongService.getHeTong(null);
        return new CommonResult(200,"查询成功！",heTong1);
    }


}
