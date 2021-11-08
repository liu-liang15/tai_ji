package com.wupai.taiji.model.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wupai.taiji.model.entity.FgNature;


import java.util.List;

public interface FgNatureService extends IService<FgNature> {
    /**
     * 查询所有房屋性质
     * @return
     */
    List<FgNature> getFgNatureList();
}
