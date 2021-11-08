package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.FyHousing;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Entity com.wupai.taiji.model.entity.FyHousing
 */
@Mapper
public interface FyHousingMapper extends BaseMapper<FyHousing> {

    /**
     * 查询所有房源
     * @return
     */
    List<FyHousing>seAllHouses();

    /**
     * 根据地址查询
     * @return
     */
    FyHousing seByCity(String city);
}




