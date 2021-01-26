package com.eswm.lyy.generator.service.impl;

import com.eswm.lyy.generator.utils.PageUtils;
import com.eswm.lyy.generator.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.eswm.lyy.generator.dao.OpinfootherlistDao;
import com.eswm.lyy.generator.entity.OpinfootherlistEntity;
import com.eswm.lyy.generator.service.OpinfootherlistService;


@Service("opinfootherlistService")
public class OpinfootherlistServiceImpl extends ServiceImpl<OpinfootherlistDao, OpinfootherlistEntity> implements OpinfootherlistService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OpinfootherlistEntity> page = this.page(
                new Query<OpinfootherlistEntity>().getPage(params),
                new QueryWrapper<OpinfootherlistEntity>()
        );

        return new PageUtils(page);
    }

}