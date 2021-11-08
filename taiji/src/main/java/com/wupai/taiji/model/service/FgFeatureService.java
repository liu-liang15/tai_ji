package com.wupai.taiji.model.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wupai.taiji.model.entity.FgFeature;

import java.util.List;

public interface FgFeatureService extends IService<FgFeature> {

    /**
     * 查询所有房屋特色
     * @return
     */
    List<FgFeature> getFgFeatureList();
}
