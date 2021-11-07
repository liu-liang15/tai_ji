package com.wupai.taiji.model.service;


import com.wupai.taiji.model.entity.ZhWxlx;
import com.wupai.taiji.model.mapper.ZhWxlxMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
@Transactional
public class ZhWxlxService {
    @Resource
    ZhWxlxMapper zhWxlxMapper;

    /**
     *
     * @return
     */
    public List<ZhWxlx> selectzhwelx(){

        return zhWxlxMapper.selectList(null);
    }

}
