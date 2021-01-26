package com.eswm.lyy.generator.service.impl;

import com.eswm.lyy.generator.utils.PageUtils;
import com.eswm.lyy.generator.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.eswm.lyy.generator.dao.MedicalmainDao;
import com.eswm.lyy.generator.entity.MedicalmainEntity;
import com.eswm.lyy.generator.service.MedicalmainService;


@Service("medicalmainService")
public class MedicalmainServiceImpl extends ServiceImpl<MedicalmainDao, MedicalmainEntity> implements MedicalmainService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MedicalmainEntity> page = this.page(
                new Query<MedicalmainEntity>().getPage(params),
                new QueryWrapper<MedicalmainEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public MedicalmainEntity getByBarCode(String barCode) {
        QueryWrapper<MedicalmainEntity> queryWrapper = new QueryWrapper<MedicalmainEntity>();
        queryWrapper.eq("barCode",barCode);
        return this.getOne(queryWrapper);
    }

}