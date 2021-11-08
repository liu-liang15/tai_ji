package com.wupai.taiji.model.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wupai.taiji.model.entity.FgOrientation;
import com.wupai.taiji.model.mapper.FgOrientationMapper;
import com.wupai.taiji.model.service.FgOrientationService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 易湘君
 * @date 2021年 11月07日10:14
 */
@Service
public class FgOrientationServiceImpl extends ServiceImpl<FgOrientationMapper, FgOrientation> implements FgOrientationService {

    /**
     * 查询所有房屋朝向
     * @return
     */
    @Override
    public List<FgOrientation> getFgOrientationList() {
        QueryWrapper<FgOrientation> query = new QueryWrapper<>();
        return this.baseMapper.selectList(query);
    }
}