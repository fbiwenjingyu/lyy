package com.eswm.lyy.generator.service.impl;

import com.eswm.lyy.generator.utils.PageUtils;
import com.eswm.lyy.generator.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.eswm.lyy.generator.dao.DiagnosisinfolistDao;
import com.eswm.lyy.generator.entity.DiagnosisinfolistEntity;
import com.eswm.lyy.generator.service.DiagnosisinfolistService;


@Service("diagnosisinfolistService")
public class DiagnosisinfolistServiceImpl extends ServiceImpl<DiagnosisinfolistDao, DiagnosisinfolistEntity> implements DiagnosisinfolistService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DiagnosisinfolistEntity> page = this.page(
                new Query<DiagnosisinfolistEntity>().getPage(params),
                new QueryWrapper<DiagnosisinfolistEntity>()
        );

        return new PageUtils(page);
    }

}