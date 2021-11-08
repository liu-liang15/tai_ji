package com.wupai.taiji.model.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wupai.taiji.model.entity.FgOrientation;


import java.util.List;

public interface FgOrientationService extends IService<FgOrientation> {

    /**
     * 查询所有的房屋朝向
     * @return
     */
    List<FgOrientation> getFgOrientationList();
}
