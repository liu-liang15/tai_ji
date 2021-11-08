package com.wupai.taiji.model.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wupai.taiji.model.entity.FgNature;
import com.wupai.taiji.model.mapper.FgNatureMapper;
import com.wupai.taiji.model.service.FgNatureService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 易湘君
 * @date 2021年 11月07日9:34
 */
@Service
public class FgNatureServiceImpl extends ServiceImpl<FgNatureMapper, FgNature> implements FgNatureService {

    /**
     * 查询所有房屋性质
     * @return
     */
    @Override
    public List<FgNature> getFgNatureList() {
        QueryWrapper<FgNature> query = new QueryWrapper<>();
        return this.baseMapper.selectList(query);
    }
}