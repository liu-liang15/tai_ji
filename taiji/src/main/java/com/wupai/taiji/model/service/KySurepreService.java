package com.wupai.taiji.model.service;


import com.wupai.taiji.model.entity.KySurepre;
import com.wupai.taiji.model.mapper.KySurepreMapper;
import com.wupai.taiji.vo.SuPreVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service
public class KySurepreService{
@Resource
    KySurepreMapper kySurepreMapper;

    /**
     * 新增预定
     * @param suPreVo
     * @return
     */
   public Integer addSuPre(SuPreVo suPreVo){
        return kySurepreMapper.addSuPre(suPreVo);
    }
}
