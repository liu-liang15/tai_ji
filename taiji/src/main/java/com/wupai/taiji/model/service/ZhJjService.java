package com.wupai.taiji.model.service;

import com.wupai.taiji.model.entity.ZhJj;
import com.wupai.taiji.model.mapper.ZhJjMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wenlijun
 * @date 2021年 11月07日9:29
 */
@Service
@Transactional
public class ZhJjService {
    @Resource
    ZhJjMapper zhJjMapper;
    public List<ZhJj>selectjj(){
        return zhJjMapper.selectList(null);
    }
}
