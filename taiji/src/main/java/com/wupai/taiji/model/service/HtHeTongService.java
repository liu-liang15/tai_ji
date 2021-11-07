package com.wupai.taiji.model.service;


import com.wupai.taiji.model.entity.HtHeTong;
import com.wupai.taiji.model.mapper.HtHeTongMapper;
import com.wupai.taiji.util.CommonResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
@Transactional
public class HtHeTongService {
    @Resource
    HtHeTongMapper heTongMapper;

    public List<HtHeTong> getHeTong(HtHeTong heTong) {
        return heTongMapper.allHeTong(heTong);
    }
}
