package com.wupai.taiji.model.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wupai.taiji.model.entity.FgFitment;


import java.util.List;

public interface FgFitmentService extends IService<FgFitment> {

    /**
     * 查询所有装修类型
     * @return
     */
    List<FgFitment> getFgFitmentList();
}
