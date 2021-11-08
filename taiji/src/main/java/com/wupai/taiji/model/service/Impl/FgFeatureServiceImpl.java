package com.wupai.taiji.model.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wupai.taiji.model.entity.FgFeature;
import com.wupai.taiji.model.mapper.FgFeatureMapper;
import com.wupai.taiji.model.service.FgFeatureService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 易湘君
 * @date 2021年 11月07日11:01
 */
@Service
public class FgFeatureServiceImpl extends ServiceImpl<FgFeatureMapper, FgFeature> implements FgFeatureService {
    /**
     * 查询所有房屋特色
     * @return
     */
    @Override
    public List<FgFeature> getFgFeatureList() {
        QueryWrapper<FgFeature> query = new QueryWrapper<>();
        return this.baseMapper.selectList(query);
    }
}