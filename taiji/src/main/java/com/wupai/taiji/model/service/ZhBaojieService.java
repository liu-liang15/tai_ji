package com.wupai.taiji.model.service;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.ZhBaojie;
import com.wupai.taiji.model.mapper.ZhBaojieMapper;
import com.wupai.taiji.vo.ZhWeixiuVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
@Transactional
public class ZhBaojieService {
    @Resource
    private ZhBaojieMapper zhBaojieMapper;
    //保洁查询
    public PageInfo<ZhBaojie> findBypage(@RequestParam("currentPage") int currentPage,@RequestParam("pagesize") int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<ZhBaojie> entityPage =zhBaojieMapper.findBypage();
        PageInfo<ZhBaojie> classtypePageInfo =new PageInfo<>(entityPage);
        return classtypePageInfo;
    }
}
