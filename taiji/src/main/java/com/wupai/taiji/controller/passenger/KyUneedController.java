package com.wupai.taiji.controller.passenger;

import com.wupai.taiji.model.service.KyUneedService;
import com.wupai.taiji.vo.UneedVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 杨思
 * @date 2021年 11月07日18:12
 *
 *
 */
@RestController
@RequestMapping("/uneed")
public class KyUneedController {
    @Resource
    KyUneedService kyUneedService;

    @PostMapping("/add")
    public Integer addUneed(@RequestBody UneedVo uneedVo){
        return kyUneedService.addUneed(uneedVo);
    }

}
