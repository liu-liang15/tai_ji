package com.wupai.taiji.controller.afterrent;

import com.github.pagehelper.PageInfo;
import com.wupai.taiji.model.entity.ZhWeixiu;
import com.wupai.taiji.model.service.ZhWeixiuService;
import com.wupai.taiji.util.CommonResult;
import com.wupai.taiji.vo.ZhWeixiuVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wenlijun
 * @date 2021年 11月07日11:08
 */
@RestController
@Slf4j
public class ZhWeiXiuContorller {
    @Resource
    private ZhWeixiuService zhWeixiuService;

        //分页查询所有维修单
    @GetMapping("slectPageAll")
    public PageInfo<ZhWeixiuVo>slectPageAll(@RequestParam("page") Integer currentPage, @RequestParam("pageSize") Integer pagesize){
        return  zhWeixiuService.findBypage(currentPage,pagesize);
    }

    //条件查询你
//    @GetMapping("slectPageAll")
//    public PageInfo<ZhWeixiuVo>selectone(@RequestParam("page") Integer currentPage, @RequestParam("pageSize") Integer pagesize){
//        return  zhWeixiuService.selectone(currentPage,pagesize);
//    }

    //新增维修单
    @PostMapping("insertBatch")
    public CommonResult insertBatchaa(@RequestBody ZhWeixiu zhWeixiu){
        System.out.println("新增获取数据："+zhWeixiu);
        Integer zv = zhWeixiuService.insertBatchaa(zhWeixiu);
        if(zv>0){
            return new CommonResult(200,"新增成功！",zv);
        }else{
            return new CommonResult(203,"新增失败！");
        }
    }

    //修改维修单
    @PostMapping("/update")
    public CommonResult update(@RequestBody ZhWeixiu zhWeixiu){
        Integer zv = zhWeixiuService.update(zhWeixiu);
        if (zv!=null)
            return new CommonResult(200,"修改成功！");
        else
            return new CommonResult(200,"修改失败",zv);
    }

    //修改维修状态
    @PostMapping("/updatezt")
    public CommonResult updatezt(@RequestBody ZhWeixiu zhWeixiu){
        Integer zv = zhWeixiuService.updatezt(zhWeixiu);
        if (zv!=null)
            return new CommonResult(200,"修改成功！");
        else
            return new CommonResult(200,"修改失败",zv);
    }



}
