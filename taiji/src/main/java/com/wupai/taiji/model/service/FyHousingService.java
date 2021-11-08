package com.wupai.taiji.model.service;


import com.wupai.taiji.model.entity.FyHousing;
import com.wupai.taiji.model.mapper.FyHousingMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
public class FyHousingService  {
@Resource
FyHousingMapper fyHousingMapper;

    /**
     * 查询所有房源
     * @return
     */
   public List<FyHousing> seAllHouses(){
       return fyHousingMapper.seAllHouses();
   }


    /**
     * 根据名字查询
     * @return
     */
   public  FyHousing seByCity(String city){
       return fyHousingMapper.seByCity(city);
   }
}
