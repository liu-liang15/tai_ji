package com.wupai.taiji.model.service.Impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wupai.taiji.model.entity.FyHousing;
import com.wupai.taiji.model.mapper.FyHousingMapper;
import com.wupai.taiji.model.service.FyHousingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author 易湘君
 * @date 2021年 11月08日14:32
 */
@Service
public class FyHousingServiceImpl extends ServiceImpl<FyHousingMapper, FyHousing> implements FyHousingService {

    @Resource
    FyHousingMapper fyHousingMapper;

    /**
     * 查询所有房源
     * @return
     */
    @Override
    public List<FyHousing> getFyHousingList() {
        QueryWrapper<FyHousing> query = new QueryWrapper<>();
        query.eq("joint_rent",1);
        return fyHousingMapper.selectList(query);
    }

    /**
     * 查询所有房源和房间
     * @return
     */
    @Override
    public List<FyHousing> selectHousingList() {
        return fyHousingMapper.selectHousingList();
    }
}