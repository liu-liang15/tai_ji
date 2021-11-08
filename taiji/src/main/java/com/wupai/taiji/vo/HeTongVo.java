package com.wupai.taiji.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.wupai.taiji.model.entity.FyHousing;
import com.wupai.taiji.model.entity.HtHeTong;
import com.wupai.taiji.model.entity.HtRuZhur;
import lombok.Data;

import java.util.List;

/**
 * @author 刘亮
 * @date 2021年 11月08日14:58
 */
@Data
public class HeTongVo {
    /**
     * 承租人实体类
     */
    private HtRuZhur czrPojo;

    /**
     * 同 住 人 集 合
     */
    private List<HtRuZhur> czrs;

    /**
     *合同表
     */
    private HtHeTong heTong;

    /**
     *房源表
     */
    private FyHousing fyHousing;



}
