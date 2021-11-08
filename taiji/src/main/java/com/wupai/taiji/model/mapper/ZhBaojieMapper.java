package com.wupai.taiji.model.mapper;

import com.wupai.taiji.model.entity.ZhBaojie;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Entity com.wupai.taiji.model.entity.ZhBaojie
 */
@Mapper
public interface ZhBaojieMapper extends BaseMapper<ZhBaojie> {
    List<ZhBaojie> findBypage();
}




