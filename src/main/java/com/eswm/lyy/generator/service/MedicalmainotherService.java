package com.eswm.lyy.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.eswm.lyy.generator.entity.MedicalmainotherEntity;
import com.eswm.lyy.generator.utils.PageUtils;

import java.util.Map;

/**
 * ${comments}
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-01-26 17:07:07
 */
public interface MedicalmainotherService extends IService<MedicalmainotherEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

