package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.HtHeTong;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Entity com.wupai.taiji.model.entity.HtHeTong
 */
@Mapper
public interface HtHeTongMapper extends BaseMapper<HtHeTong> {

    List<HtHeTong> allHeTong(@Param("zt") String zhuangTai,@Param("pramt") String parmt);
}




