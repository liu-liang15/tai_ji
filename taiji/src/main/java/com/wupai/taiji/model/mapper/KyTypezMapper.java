package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.KyTypez;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wupai.taiji.vo.TypezVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Entity com.wupai.taiji.model.entity.KyTypez
 */
@Mapper
public interface KyTypezMapper extends BaseMapper<KyTypez> {

    /**
     * 根据父类查询所有类型
     * @return
     */
    List<KyTypez>seTypeAll(TypezVo typezVo);


    /**
     * 根据编号查询
     * @return
     */
    KyTypez seByTid(TypezVo typezVo);
}




