package com.wupai.taiji.model.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.KyCustominfo;
import com.wupai.taiji.model.mapper.KyCustominfoMapper;
import com.wupai.taiji.vo.CustomInfoVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *客户信息service
 */
@Service
public class KyCustominfoService {
@Resource
   KyCustominfoMapper kyCustominfoMapper;

    /**
     * 新增客源信息
     * @return
     */
    public Integer addCustomInfo(KyCustominfo  kyCustominfo){
        System.out.println(kyCustominfo+"参数");
        return kyCustominfoMapper.addCustomInfo(kyCustominfo);
    }


    /**
     * 分页查询所有
      * @return
     */
public PageInfo<KyCustominfo> selectCus(CustomInfoVo customInfoVo){
    PageHelper.startPage(customInfoVo.getPageNo(),customInfoVo.getPageSize());
    List<KyCustominfo> list= kyCustominfoMapper.seCuMes();
    return new PageInfo<>(list);
}


public  List<KyCustominfo> allMes(){
    return kyCustominfoMapper.seCuMes();
}


    /**
     * 根据名字查询
     * @param customInfoVo
     * @return
     */
   public  KyCustominfo seByName(CustomInfoVo customInfoVo){
    return kyCustominfoMapper.seByName(customInfoVo);
    }

    /**
     * 查询更多的信息
     * @param customInfoVo
     * @return
     */
    public PageInfo<KyCustominfo> seMoreMes(CustomInfoVo customInfoVo){
        PageHelper.startPage(customInfoVo.getPageNo(),customInfoVo.getPageSize());
        List<KyCustominfo> list= kyCustominfoMapper.seMoreMes();
        return new PageInfo<>(list);
    }

}
