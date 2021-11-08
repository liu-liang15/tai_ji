package com.wupai.taiji.controller.passenger;

import com.wupai.taiji.model.entity.KyTypez;
import com.wupai.taiji.model.service.KyTypezService;
import com.wupai.taiji.vo.TypezVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author 杨思
 * @date 2021年 11月07日11:03
 */
@RestController
@RequestMapping("/typez")
public class KyTypezController {

    @Resource
    KyTypezService kyTypezService;


    /**
     * 查询所有类型
     * @param
     * @return
     */
    @PostMapping ("/all")
    public List<KyTypez> seTypeAll(@RequestBody TypezVo typezVo){
        return kyTypezService.seTypeAll(typezVo);
    }


    /**
     * 查询某一个
     * @return
     */
    @PostMapping ("/one")
    public KyTypez seByTid(@RequestBody TypezVo typezVo){
        return kyTypezService.seByTid(typezVo);
    }
}
