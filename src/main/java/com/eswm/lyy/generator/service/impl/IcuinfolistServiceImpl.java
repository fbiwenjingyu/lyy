package com.eswm.lyy.generator.service.impl;

import com.eswm.lyy.generator.utils.PageUtils;
import com.eswm.lyy.generator.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.eswm.lyy.generator.dao.IcuinfolistDao;
import com.eswm.lyy.generator.entity.IcuinfolistEntity;
import com.eswm.lyy.generator.service.IcuinfolistService;


@Service("icuinfolistService")
public class IcuinfolistServiceImpl extends ServiceImpl<IcuinfolistDao, IcuinfolistEntity> implements IcuinfolistService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IcuinfolistEntity> page = this.page(
                new Query<IcuinfolistEntity>().getPage(params),
                new QueryWrapper<IcuinfolistEntity>()
        );

        return new PageUtils(page);
    }

}