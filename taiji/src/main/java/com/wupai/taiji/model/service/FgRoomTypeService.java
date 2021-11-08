package com.wupai.taiji.model.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wupai.taiji.model.entity.FgRoomType;


import java.util.List;


public interface FgRoomTypeService extends IService<FgRoomType> {
    /**
     * 查询所有房间
     * @return
     */
    List<FgRoomType> getFgRoomTypeList();
}
