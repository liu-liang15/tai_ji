package com.wupai.taiji.model.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.wupai.taiji.model.entity.ZhWeixiu;
import com.wupai.taiji.model.mapper.ZhWeixiuMapper;
import com.wupai.taiji.vo.Weivo;
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
public class ZhWeixiuService  {
    @Resource
    private ZhWeixiuMapper zhWeixiuMapper;
    //分页查询
    public PageInfo<ZhWeixiuVo> findBypage( int currentPage, int pagesize){
        PageHelper.startPage(currentPage,pagesize);
        List<ZhWeixiuVo> entityPage =zhWeixiuMapper.findBypage();
        PageInfo<ZhWeixiuVo> classtypePageInfo =new PageInfo<>(entityPage);
        return classtypePageInfo;
    }
    //条件查询
    public PageInfo<ZhWeixiuVo> selectone(Weivo weivo){
        PageHelper.startPage(weivo.getUrrentPage(),weivo.getPagesize());
        List<ZhWeixiuVo> entityPage =zhWeixiuMapper.findBypage();
        PageInfo<ZhWeixiuVo> classtypePageInfo =new PageInfo<>(entityPage);
        return classtypePageInfo;
    }

    //新增维修类型
    public Integer insertBatchaa(ZhWeixiu zhWeixiu) {
        Integer count =  zhWeixiuMapper.insertBatchaa(zhWeixiu);
        return count;
    }

    //修改维修数据

    public Integer update(ZhWeixiu zhWeixiu){
        zhWeixiu.setZtIds("2");
        Integer count=zhWeixiuMapper.update(zhWeixiu);
        return  count;
    }
    //修改维修状态
    public Integer updatezt(ZhWeixiu zhWeixiu){
        Integer count =zhWeixiuMapper.updatezt(zhWeixiu);
        return  count;
    }

    //删除维修订单
    public Integer deleteById(ZhWeixiu zhWeixiu){
        Integer count =zhWeixiuMapper.deleteById(zhWeixiu);
        return  count;
    }


}
