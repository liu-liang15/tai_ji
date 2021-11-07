package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.HtHeTong;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Entity com.wupai.taiji.model.entity.HtHeTong
 */
public interface HtHeTongMapper extends BaseMapper<HtHeTong> {

    List<HtHeTong> allHeTong(HtHeTong heTong);
}




