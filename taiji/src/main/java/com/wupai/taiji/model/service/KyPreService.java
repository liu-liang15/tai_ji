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



}
