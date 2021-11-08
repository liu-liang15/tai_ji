package com.wupai.taiji.controller.afterrent;

import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.ZhBaojie;
import com.wupai.taiji.model.service.ZhBaojieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wenlijun
 * @date 2021年 11月08日20:04
 */
@RestController
@Slf4j
public class ZhBaojieContorller {
    @Resource
    private ZhBaojieService zhBaojieService;
    @GetMapping("slectPageAll1")
    public PageInfo<ZhBaojie> slectPageAll(@RequestParam("page") int currentPage, @RequestParam("pageSize") int pagesize){
        return  zhBaojieService.findBypage(currentPage,pagesize);
    }
}
