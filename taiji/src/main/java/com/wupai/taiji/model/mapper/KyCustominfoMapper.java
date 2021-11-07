package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.KyCustominfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wupai.taiji.vo.CustomInfoVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.wupai.taiji.model.entity.KyCustominfo
 */
@Mapper
public interface KyCustominfoMapper extends BaseMapper<KyCustominfo> {

    /**
     *
     * 新增客户基本信息
     * @return
     */
    int addCustomInfo(CustomInfoVo customInfoVo);
}




