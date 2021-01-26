package com.eswm.lyy.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eswm.lyy.generator.entity.MedicalmainEntity;
import com.eswm.lyy.generator.utils.PageUtils;

import java.util.Map;

/**
 * 病案首页主信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-01-26 15:56:26
 */
public interface MedicalmainService extends IService<MedicalmainEntity> {

    PageUtils queryPage(Map<String, Object> params);

    MedicalmainEntity getByBarCode(String barCode);
}

