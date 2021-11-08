package com.wupai.taiji.model.mapper;


import com.wupai.taiji.model.entity.ZhWeixiu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wupai.taiji.vo.ZhWeixiuVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Entity com.wupai.taiji.model.entity.ZhWeixiu
 */
@Mapper
public interface ZhWeixiuMapper extends BaseMapper<ZhWeixiu> {
    //分页查询所有
    List<ZhWeixiuVo> findBypage();
    //新增订单
    int insertBatchaa(ZhWeixiu zhWeixiu);
    //修改订单
    int update(ZhWeixiu zhWeixiu);
    //修改订单状态
    int updatezt(ZhWeixiu zhWeixiu);

    List<ZhWeixiuVo>selectone();

}




