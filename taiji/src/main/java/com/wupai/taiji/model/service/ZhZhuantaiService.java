package com.wupai.taiji.model.service;


import com.wupai.taiji.model.entity.ZhZhuantai;
import com.wupai.taiji.model.mapper.ZhZhuantaiMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
@Transactional
public class ZhZhuantaiService  {
    @Resource
    ZhZhuantaiMapper zhZhuantaiMapper;

    public List<ZhZhuantai> selectzhuantai(){
        return zhZhuantaiMapper.selectList(null);
    }
}
