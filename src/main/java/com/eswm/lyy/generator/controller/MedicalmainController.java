package com.eswm.lyy.generator.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.eswm.lyy.generator.entity.*;
import com.eswm.lyy.generator.service.*;
import com.eswm.lyy.generator.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eswm.lyy.generator.utils.PageUtils;


/**
 * 病案首页主信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-01-26 15:56:26
 */
@RestController
@RequestMapping("generator/medicalmain")
public class MedicalmainController {
    @Autowired
    private MedicalmainService medicalmainService;

    @Autowired
    private BabyinfolistService babyinfolistService;

    @Autowired
    private DiagnosisinfolistService diagnosisinfolistService;

    @Autowired
    private IcuinfolistService icuinfolistService;

    @Autowired
    private MedicalmainotherService medicalmainotherService;

    @Autowired
    private OperationinfolistService operationinfolistService;

    @Autowired
    private OpinfootherlistService opinfootherlistService;




    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = medicalmainService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{patientid}")
    public R info(@PathVariable("patientid") String patientid){
		MedicalmainEntity medicalmain = medicalmainService.getById(patientid);

        return R.ok().put("medicalmain", medicalmain);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MedicalmainEntity medicalmain){
		medicalmainService.save(medicalmain);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MedicalmainEntity medicalmain){
		medicalmainService.updateById(medicalmain);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] patientids){
		medicalmainService.removeByIds(Arrays.asList(patientids));

        return R.ok();
    }

    @RequestMapping("/queryByBarCode")
    public R queryByBarCode(@RequestParam String barCode){
        JSONObject data = new JSONObject();
        MedicalmainEntity medicalmainEntity  =  medicalmainService.getByBarCode(barCode);
        if(medicalmainEntity !=null){
            if(!"1".equals(medicalmainEntity.getQualityresult())){
                return R.error(2,"此条记录未审核通过");
            }

            String prn = medicalmainEntity.getPrn();
            Integer times = medicalmainEntity.getTimes();
            QueryWrapper<BabyinfolistEntity> babyinfolistEntityWrapper = new QueryWrapper<>();
            babyinfolistEntityWrapper.eq("prn",prn);
            babyinfolistEntityWrapper.eq("times",times);
            List<BabyinfolistEntity> babyInfoList = babyinfolistService.list(babyinfolistEntityWrapper);

            QueryWrapper<DiagnosisinfolistEntity> diagnosisinfolistEntityQueryWrapper = new QueryWrapper<>();
            diagnosisinfolistEntityQueryWrapper.eq("prn",prn);
            diagnosisinfolistEntityQueryWrapper.eq("times",times);
            List<DiagnosisinfolistEntity> diagnosisInfoList = diagnosisinfolistService.list(diagnosisinfolistEntityQueryWrapper);

            QueryWrapper<IcuinfolistEntity> icuinfolistEntityQueryWrapper = new QueryWrapper<>();
            icuinfolistEntityQueryWrapper.eq("prn",prn);
            icuinfolistEntityQueryWrapper.eq("times",times);
            List<IcuinfolistEntity> icuInfoList = icuinfolistService.list(icuinfolistEntityQueryWrapper);

            QueryWrapper<MedicalmainotherEntity> medicalmainotherEntityQueryWrapper = new QueryWrapper<>();
            medicalmainotherEntityQueryWrapper.eq("prn",prn);
            medicalmainotherEntityQueryWrapper.eq("times",times);
            List<MedicalmainotherEntity> medicalMainOther = medicalmainotherService.list(medicalmainotherEntityQueryWrapper);

            QueryWrapper<OperationinfolistEntity> operationinfolistEntityQueryWrapper = new QueryWrapper<>();
            operationinfolistEntityQueryWrapper.eq("prn",prn);
            operationinfolistEntityQueryWrapper.eq("times",times);
            List<OperationinfolistEntity> operationInfoList = operationinfolistService.list(operationinfolistEntityQueryWrapper);

            QueryWrapper<OpinfootherlistEntity> opinfootherlistEntityQueryWrapper = new QueryWrapper<>();
            opinfootherlistEntityQueryWrapper.eq("prn",prn);
            opinfootherlistEntityQueryWrapper.eq("times",times);
            List<OpinfootherlistEntity> opInfoOtherList = opinfootherlistService.list(opinfootherlistEntityQueryWrapper);

            data.put("medicalMain",medicalmainEntity);
            data.put("babyInfoList",babyInfoList);
            data.put("diagnosisInfoList",diagnosisInfoList);
            data.put("icuInfoList",icuInfoList);
            data.put("medicalMainOther",medicalMainOther);
            data.put("operationInfoList",operationInfoList);
            data.put("opInfoOtherList",opInfoOtherList);

            return R.ok().put("data",data);
        }
        return R.error(1,"此条记录不存在");
    }

}
