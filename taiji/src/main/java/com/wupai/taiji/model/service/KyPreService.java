package com.wupai.taiji.model.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.KyCustominfo;
import com.wupai.taiji.model.entity.KyPre;
import com.wupai.taiji.model.mapper.KyPreMapper;
import com.wupai.taiji.vo.CustomInfoVo;
import com.wupai.taiji.vo.PreVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
public class KyPreService {
@Resource
    KyPreMapper kyPreMapper;

//新增
    public Integer addPre(PreVo preVo){
        return kyPreMapper.addPre(preVo);
    }

  /**
     * 查询所有预约信息
     * @return
     */
    public PageInfo<KyPre>seAllPre(PreVo preVo){
       PageHelper.startPage(preVo.getPageNo(),preVo.getPageSize());
        List<KyPre> list= kyPreMapper.seAllPre();
        return new PageInfo<>(list);
    }


    /**
     * 组合查询所有预约信息
     * @return
     */
    public PageInfo<KyPre>seAllGPre (PreVo preVo){
        System.out.println(preVo.getPhid()+"111111111111"+preVo.getPcid()+"查询到的信息 p_hid  pcid");
        PageHelper.startPage(preVo.getPageNo(),preVo.getPageSize());
        List<KyPre> list= kyPreMapper.seAllGPre(preVo);
        return new PageInfo<>(list);
    }

}
