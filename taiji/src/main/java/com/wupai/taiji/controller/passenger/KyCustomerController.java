package com.wupai.taiji.controller.passenger;

import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.FyHousing;
import com.wupai.taiji.model.entity.KyCustominfo;
import com.wupai.taiji.model.entity.KyTypez;
import com.wupai.taiji.model.service.FyHousingService;
import com.wupai.taiji.model.service.KyCustominfoService;
import com.wupai.taiji.util.CommonResult;
import com.wupai.taiji.vo.CustomInfoVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 * @author 杨思
 * @date 2021年 11月07日10:26
 * 客户信息类
 *
 */
@RestController
@RequestMapping("/customer")
public class KyCustomerController {
 @Resource
    KyCustominfoService  kyCustominfoService;
    @Resource
    FyHousingService fyHousingService;

    /**
     * 新增客源信息新增客户需求
     * @param
     * @return
      */
    @GetMapping("/add")
    public Integer addCustomInfo(@RequestParam(value = "cname",defaultValue = "") String cname,
                                                                                 @RequestParam(value = "ctel",defaultValue = "") String ctel,
                                                                                 @RequestParam(value = "cardnum",defaultValue = "") String cardnum,
                                                                                    @RequestParam(value = "csex",defaultValue = "") String csex,
                                                                                 @RequestParam(value = "cTypeid",defaultValue = "") Integer cTypeid){
       KyTypez typez=new KyTypez();
        typez.setTid(cTypeid);
        KyCustominfo custominfo=new KyCustominfo();
        custominfo.setCtype(typez);
        custominfo.setCsex(csex);
        custominfo.setCardnum(cardnum);
        custominfo.setCname(cname);
        custominfo.setCtel(ctel);
        Integer num=kyCustominfoService.addCustomInfo(custominfo);

        if(num!=0){
            return  custominfo.getCid();
         }
        return -1;
    }


    /**
     * 查询所有房源
     * @return
     */
    @PostMapping("/allhouse")
    public List<FyHousing> seAllHouses(){
        return  fyHousingService.seAllHouses();
    }

    /**
     * 查询所有信息
     * @param
     * @param
     * @return
     */
    @PostMapping("/allmes")
    public PageInfo<KyCustominfo> selectCus(@RequestBody CustomInfoVo customInfoVo){
        return kyCustominfoService.selectCus(customInfoVo);
    }

    @PostMapping("/mess")
    public List<KyCustominfo>seAllMes(){
        return kyCustominfoService.allMes();
    }

    @PostMapping("/byname")
    public  KyCustominfo seByName(@RequestBody CustomInfoVo customInfoVo){
        return  kyCustominfoService.seByName(customInfoVo);
    }

    /**
     * 客户表和需求表
     * @param customInfoVo
     * @return
     */
    @PostMapping("/moremres")
    public PageInfo<KyCustominfo> seMoreMes(@RequestBody CustomInfoVo customInfoVo){
        return kyCustominfoService.seMoreMes(customInfoVo);
    }

    /**
     * 多条件组合查询
     * @param customInfoVo
     * @return
     */
    @PostMapping("/group")
    public PageInfo<KyCustominfo> seGroup(@RequestBody CustomInfoVo customInfoVo){
        return kyCustominfoService.seGroup(customInfoVo);
    }



@PostMapping("/morelike")
public PageInfo<KyCustominfo> seMoreLike(@RequestBody CustomInfoVo customInfoVo){
    return kyCustominfoService.seMoreLike(customInfoVo);
}

}
