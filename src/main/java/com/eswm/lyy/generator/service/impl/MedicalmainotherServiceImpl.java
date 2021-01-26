package com.eswm.lyy.generator.service.impl;

import com.eswm.lyy.generator.utils.PageUtils;
import com.eswm.lyy.generator.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.eswm.lyy.generator.dao.MedicalmainotherDao;
import com.eswm.lyy.generator.entity.MedicalmainotherEntity;
import com.eswm.lyy.generator.service.MedicalmainotherService;


@Service("medicalmainotherService")
public class MedicalmainotherServiceImpl extends ServiceImpl<MedicalmainotherDao, MedicalmainotherEntity> implements MedicalmainotherService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MedicalmainotherEntity> page = this.page(
                new Query<MedicalmainotherEntity>().getPage(params),
                new QueryWrapper<MedicalmainotherEntity>()
        );

        return new PageUtils(page);
    }

}