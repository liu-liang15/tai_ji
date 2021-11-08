package com.wupai.taiji.model.service;


import com.wupai.taiji.model.entity.KyTypez;
import com.wupai.taiji.model.mapper.KyTypezMapper;
import com.wupai.taiji.vo.TypezVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *KyTypezService
 */
@Service
public class KyTypezService {

    @Resource
    KyTypezMapper  kyTypezMapper;

    /**
     * 查询所有类型
     * @param
     * @return
     */
   public  List<KyTypez> seTypeAll(TypezVo typezVo){
       return kyTypezMapper.seTypeAll(typezVo);
   }


    /**
     * 根据编号查询
     * @return
     */
    public KyTypez seByTid(TypezVo typezVo){
        return kyTypezMapper.seByTid(typezVo);
    }


}
