package com.wupai.taiji.controller.passenger;

import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.KyPre;
import com.wupai.taiji.model.entity.KySurepre;
import com.wupai.taiji.model.service.KyPreService;
import com.wupai.taiji.vo.PreVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 杨思
 * @date 2021年 11月08日3:06
 *
 */
@RestController
@RequestMapping("/pre")
public class KyPreController {
    @Resource
    private KyPreService kyPreService;

    /**
     * 新增预约
     * @param preVo
     * @return
     */
    @PostMapping("/add")
public Integer addPre(@RequestBody PreVo preVo){
    return kyPreService.addPre(preVo);
}






}
