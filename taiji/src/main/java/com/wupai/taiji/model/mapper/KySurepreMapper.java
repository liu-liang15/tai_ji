package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.KySurepre;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wupai.taiji.vo.SuPreVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.wupai.taiji.model.entity.KySurepre
 */
@Mapper
public interface KySurepreMapper extends BaseMapper<KySurepre> {

    /**
     * 新增预定
     * @return
     */
   int addSuPre(SuPreVo suPreVo);

    /**
     * 根据客户编号查询客户预定
     * @param scid
     * @return
     */
   KySurepre seByCid(Integer scid);
}




