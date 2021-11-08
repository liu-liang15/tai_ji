package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.KyCustominfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wupai.taiji.vo.CustomInfoVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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
    int addCustomInfo(KyCustominfo  kyCustominfo);

    /**
     *
     * 查询所有客户信息
     * @return
     */
    List<KyCustominfo> seCuMes();

    /**
     * 根据名字查询
     * @return
     */
    KyCustominfo seByName(CustomInfoVo customInfoVo);


    /**
     * 表联查相关信息
     * @return
     */
    List<KyCustominfo>seMoreMes();

    /**
     * 多条件组合查询
     * @return
     */
    List<KyCustominfo>seGroup();
}




