package com.wupai.taiji.model.service;


import com.wupai.taiji.model.entity.HtRuZhur;
import com.wupai.taiji.model.mapper.HtRuZhurMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Service
@Transactional
public class HtRuZhurService {
    @Resource
    HtRuZhurMapper htRuZhurMapper;

    /**
     * 查询所有入住人
     * @return
     */
    public List<HtRuZhur> getrzr(){
        return htRuZhurMapper.selectList(null);
    }

    /**
     * 修改电话号码
     * @return
     */
    public int updateDh(HtRuZhur htRuZhur) {
        return htRuZhurMapper.updateById(htRuZhur);
    }

    /**
     * 删除同住人
     * @param tzId
     * @return
     */
    public int deleteRz(String tzId) {
            return htRuZhurMapper.deleteById(tzId);
    }
}
