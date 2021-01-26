package com.eswm.lyy.generator.service.impl;

import com.eswm.lyy.generator.utils.PageUtils;
import com.eswm.lyy.generator.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.eswm.lyy.generator.dao.BabyinfolistDao;
import com.eswm.lyy.generator.entity.BabyinfolistEntity;
import com.eswm.lyy.generator.service.BabyinfolistService;


@Service("babyinfolistService")
public class BabyinfolistServiceImpl extends ServiceImpl<BabyinfolistDao, BabyinfolistEntity> implements BabyinfolistService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BabyinfolistEntity> page = this.page(
                new Query<BabyinfolistEntity>().getPage(params),
                new QueryWrapper<BabyinfolistEntity>()
        );

        return new PageUtils(page);
    }

}