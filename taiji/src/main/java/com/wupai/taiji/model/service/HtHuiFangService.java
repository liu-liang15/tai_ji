package com.wupai.taiji.model.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wupai.taiji.model.entity.HtHuiFang;
import com.wupai.taiji.model.mapper.HtHuiFangMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
@Transactional
public class HtHuiFangService {

    @Resource
    HtHuiFangMapper htHuiFangMapper;
    /**
     * 批量回复的方法
     */
    public int insert(List<HtHuiFang> list) {
        int i=0;
        for (HtHuiFang htHuiFang : list) {
           i= htHuiFangMapper.insert(htHuiFang);
        }
        return i;
    }

    public List<HtHuiFang> selectId(String htId) {
        //条件构造器
        QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("ht_id", htId);
        return htHuiFangMapper.selectList(queryWrapper);
    }
}
