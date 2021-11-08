package com.wupai.taiji.model.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wupai.taiji.model.entity.FgRoomType;
import com.wupai.taiji.model.mapper.FgRoomTypeMapper;
import com.wupai.taiji.model.service.FgRoomTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 易湘君
 * @date 2021年 11月06日23:33
 */
@Service
public class FgRoomTypeServiceImpl extends ServiceImpl<FgRoomTypeMapper, FgRoomType> implements FgRoomTypeService {

    /**
     * 查询所有房间
     * @return
     */
    @Override
    public List<FgRoomType> getFgRoomTypeList() {
        QueryWrapper<FgRoomType> query = new QueryWrapper<>();
        return this.baseMapper.selectList(query);
    }

}