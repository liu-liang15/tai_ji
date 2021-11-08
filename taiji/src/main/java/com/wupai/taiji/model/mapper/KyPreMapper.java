package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.KyPre;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wupai.taiji.vo.PreVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Entity com.wupai.taiji.model.entity.KyPre
 */
@Mapper
public interface KyPreMapper extends BaseMapper<KyPre> {

    /**
     * 新增预约
     * @param preVo
     * @return
     */
    int addPre(PreVo preVo);

    KyPre seByCid(Integer cid);



}




