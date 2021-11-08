package com.wupai.taiji.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wupai.taiji.model.entity.FyHousing;


import java.util.List;

public interface FyHousingMapper extends BaseMapper<FyHousing> {

    /**
     * 查询所有房源房间数据
     * @return
     */
    List<FyHousing> selectHousingList();
}
