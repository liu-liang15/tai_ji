package com.wupai.taiji.model.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wupai.taiji.model.entity.FyHousing;


import java.util.List;

public interface FyHousingService extends IService<FyHousing> {

    /**
     * 查询所有房源
     * @return
     */
    List<FyHousing> getFyHousingList();

    /**
     * 查询所有房源和房间
     * @return
     */
    List<FyHousing> selectHousingList();

}
