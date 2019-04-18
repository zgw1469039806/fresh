package org.fresh.gd.unification.controller.management;

import lombok.extern.slf4j.Slf4j;
import org.fresh.gd.commons.consts.pojo.RequestData;
import org.fresh.gd.commons.consts.pojo.ResponseData;
import org.fresh.gd.commons.consts.pojo.dto.management.ManageStoreDTO;
import org.fresh.gd.unification.fegin.management.ManaFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @DATA 2019-04-17 15:15
 * @Author 张国伟  WeChat:17630376104
 * @Description
 */
@Slf4j
@RestController
@RequestMapping("/unification")
public class ManaController {
    @Autowired
    ManaFeginService manaFeginService;

    @PostMapping("/manAdd")
    public ResponseData<Integer> manAdd(@RequestBody RequestData<ManageStoreDTO> ruleForm)
    {
        System.err.println(ruleForm);
        //return manaFeginService.inserStore(ruleForm);
        return null;
    }

    @RequestMapping("/tttss")
    public String test(){
        return manaFeginService.test();
    }

}
