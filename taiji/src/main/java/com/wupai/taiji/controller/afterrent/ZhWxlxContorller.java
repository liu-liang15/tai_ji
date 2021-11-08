package com.wupai.taiji.controller.afterrent;

import com.wupai.taiji.model.entity.ZhWxlx;
import com.wupai.taiji.model.service.ZhWxlxService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class ZhWxlxContorller {
    @Resource
    ZhWxlxService zhWxlxService;
    @GetMapping("selectzhwxlx")
    public CommonResult selectzhwllx(){
        List<ZhWxlx> selectzhwelx = zhWxlxService.selectzhwelx();
        //code是状态  message是前端的提示
        CommonResult commonResult=new CommonResult(200,"查询成功",selectzhwelx);
        return commonResult;
    }
}
