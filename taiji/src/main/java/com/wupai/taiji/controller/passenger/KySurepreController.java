package com.wupai.taiji.controller.passenger;

import com.wupai.taiji.model.entity.CwAccount;
import com.wupai.taiji.model.entity.FyHousing;
import com.wupai.taiji.model.service.CwAccountService;
import com.wupai.taiji.model.service.CwCosttypeService;
import com.wupai.taiji.model.service.FyHousingService;
import com.wupai.taiji.model.service.KySurepreService;
import com.wupai.taiji.vo.SuPreVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 杨思
 * @date 2021年 11月07日23:46
 *
 */
@RestController
@RequestMapping("/surepre")
public class KySurepreController {
    @Resource
    private CwAccountService  cwAccountService;
    @Resource
    private FyHousingService fyHousingService;
    @Resource
    private KySurepreService kySurepreService;

//    查询账户基本信息
    @PostMapping("/mes")
 public List<CwAccount> seCountMes(){
    return cwAccountService.seCountMes();
}

    @PostMapping("/byhname")
    public FyHousing seByCity(@RequestParam String city){
    return  fyHousingService.seByCity(city);
}

    /**
     * 新增预定
     * @param suPreVo
     * @return
     */
@PostMapping("/insert")
public Integer addSuPre(@RequestBody SuPreVo suPreVo){
    return kySurepreService.addSuPre(suPreVo);
}

}
