package com.wupai.taiji.model.service;


import com.wupai.taiji.model.entity.ZhGongren;
import com.wupai.taiji.model.mapper.ZhGongrenMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
@Transactional
public class ZhGongrenService {
    @Resource
    ZhGongrenMapper zhGongrenMapper;
            public List<ZhGongren> selectgongren(){
                return zhGongrenMapper.selectList(null);
            }
}
