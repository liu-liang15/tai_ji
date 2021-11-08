package com.wupai.taiji.model.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wupai.taiji.model.entity.FgFitment;
import com.wupai.taiji.model.mapper.FgFitmentMapper;
import com.wupai.taiji.model.service.FgFitmentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 易湘君
 * @date 2021年 11月07日9:07
 */
@Service
public class FgFitmentServiceImpl extends ServiceImpl<FgFitmentMapper, FgFitment> implements FgFitmentService {

    /**
     * 查询所有装修数据
     * @return
     */
    @Override
    public List<FgFitment> getFgFitmentList() {
        QueryWrapper<FgFitment> query = new QueryWrapper<>();
        return this.baseMapper.selectList(query);
    }
}