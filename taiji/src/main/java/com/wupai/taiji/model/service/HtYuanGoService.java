package com.wupai.taiji.model.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wupai.taiji.model.entity.HtYuanGo;
import com.wupai.taiji.model.mapper.HtYuanGoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

/**
 *
 */
@Service
@Transactional
public class HtYuanGoService {
    @Resource
    HtYuanGoMapper htYuanGoMapper;

    /**
     * @param yuanGo   员工实体类
     * @return 返回查询结果
     */
    public HtYuanGo getUser(HtYuanGo yuanGo){
        //条件构造器
        QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("yg_name", yuanGo.getYgName());
        queryWrapper.eq("password",yuanGo.getPassword());
        //查询
        return htYuanGoMapper.selectOne(queryWrapper);
    }
}
