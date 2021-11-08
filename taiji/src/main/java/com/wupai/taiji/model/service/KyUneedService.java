package com.wupai.taiji.model.service;


import com.wupai.taiji.model.mapper.KyUneedMapper;
import com.wupai.taiji.vo.UneedVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service
public class KyUneedService {
@Resource
KyUneedMapper  kyUneedMapper;

    /**
     * 新增用户需求
     * @param uneedVo
     * @return
     */
    public int addUneed(UneedVo uneedVo){
        return kyUneedMapper.addUneed(uneedVo);
    }
}
