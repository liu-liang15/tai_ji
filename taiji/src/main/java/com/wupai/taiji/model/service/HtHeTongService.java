package com.wupai.taiji.model.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wupai.taiji.model.entity.FyHousing;
import com.wupai.taiji.model.entity.HtHeTong;
import com.wupai.taiji.model.entity.HtRuZhur;
import com.wupai.taiji.model.mapper.FyHousingMapper;
import com.wupai.taiji.model.mapper.HtHeTongMapper;
import com.wupai.taiji.model.mapper.HtRuZhurMapper;
import com.wupai.taiji.util.CommonResult;
import com.wupai.taiji.vo.HeTongVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Service
@Transactional
public class HtHeTongService {
    @Resource
    HtHeTongMapper heTongMapper;

    @Resource
    HtRuZhurMapper htRuZhurMapper;

    @Resource
    FyHousingMapper fyHousingMapper;

    /**
     * 查询合同表格的接口
     */
    public List<HtHeTong> getHeTong(String zhuangTai,String parmt) {
        return heTongMapper.allHeTong(zhuangTai,parmt);
    }

    public int insertHeTong(HtHeTong heTong) {
        //  新   增
        if (heTong.getZjId()==0){
            //新增入住人
            htRuZhurMapper.insert(heTong.getCzrPojo());
            //System.err.println(heTong.getCzrPojo());

            List<HtRuZhur> czrs = heTong.getCzrs();
            for (HtRuZhur czr : czrs) {
                czr.setFjId(heTong.getCzrPojo().getRzId()+"");
                htRuZhurMapper.insert(czr);
            }
            heTong.setQysj(null);
            heTong.setCjr2(heTong.getCjr().getYgId()+"");
            heTong.setCzr(heTong.getCzrPojo().getRzId()+"");
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
            String htId="HT"+df.format(new Date());// new Date()为获取当前系统时间
            heTong.setHtId(htId);
            heTongMapper.insert(heTong);
        //修改
        }else {

        }

        System.err.println(heTong);
        return 1;
    }
    /**
     *查询合同详情
     */
    public HeTongVo selectOneHt(String htId) {
        HeTongVo heTongVo=new HeTongVo();

        HtHeTong heTong = heTongMapper.selectOne(new QueryWrapper<HtHeTong>().eq("ht_id", htId));
        heTongVo.setHeTong(heTong);

        HtRuZhur htRuZhur = htRuZhurMapper.selectById(heTong.getCzr());
        heTongVo.setCzrPojo(htRuZhur);

        List<HtRuZhur> czrs = htRuZhurMapper.selectList(new QueryWrapper<HtRuZhur>().eq("fj_id", htRuZhur.getRzId()));
        heTongVo.setCzrs(czrs);

        FyHousing fyHousing = fyHousingMapper.selectById(heTong.getFwId());
        heTongVo.setFyHousing(fyHousing);

        return heTongVo;
    }
}
