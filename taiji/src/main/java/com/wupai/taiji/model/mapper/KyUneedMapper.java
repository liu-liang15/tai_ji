package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.KyUneed;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wupai.taiji.vo.CustomInfoVo;
import com.wupai.taiji.vo.UneedVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Entity com.wupai.taiji.model.entity.KyUneed
 */
@Mapper
public interface KyUneedMapper extends BaseMapper<KyUneed> {

    /**
     * 新增用户需求
     * @return
     */
    public int addUneed(UneedVo uneedVo);

    /**
     * 根据需求编号查询
     * @return
     */
    List<KyUneed>seByCid(UneedVo uneedVo);


}




