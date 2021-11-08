package com.wupai.taiji.controller.housing;



import com.wupai.taiji.model.entity.FgRoomType;
import com.wupai.taiji.model.service.FgRoomTypeService;
import com.wupai.taiji.util.CommonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 易湘君
 * @date 2021年 11月06日23:40
 */
@RestController
@RequestMapping("/roomtype")
public class FgRoomTypeController {
    @Resource
    private FgRoomTypeService fgRoomTypeService;

    /**
     * 查询所有户型
     *
     * @return
     */
    @RequestMapping("/getFgRoomTypeList")
    public CommonResult getFgRoomTypeList() {
        List<FgRoomType> fgRoomTypeList = fgRoomTypeService.getFgRoomTypeList();
        return new CommonResult(200,"成功",fgRoomTypeList);
    }

    /**
     *
     * 如果id不等于空就进行修改，如果为空则进行新增
     * @param fgRoomType
     * @return
     */
    @PostMapping("/addFgRoomType")
    public CommonResult addFgRoomType(@RequestBody FgRoomType fgRoomType) {
        if (fgRoomType.getTypeId()!=null) {
            fgRoomTypeService.updateById(fgRoomType);
        } else {
            fgRoomTypeService.save(fgRoomType);
            return new CommonResult(200,"成功");
        }
        return new CommonResult(200,"成功");
    }

    /**
     * 根据当前行id进行数据删除
     * @param typeId
     * @return
     */
    @RequestMapping("/deleteFgRoomType")
    public CommonResult deleteFgRoomType(Integer typeId){
        fgRoomTypeService.removeById(typeId);
        return new CommonResult(200,"成功");
    }


}