package com.eswm.lyy.generator.service.impl;

import com.eswm.lyy.generator.utils.PageUtils;
import com.eswm.lyy.generator.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.eswm.lyy.generator.dao.OperationinfolistDao;
import com.eswm.lyy.generator.entity.OperationinfolistEntity;
import com.eswm.lyy.generator.service.OperationinfolistService;


@Service("operationinfolistService")
public class OperationinfolistServiceImpl extends ServiceImpl<OperationinfolistDao, OperationinfolistEntity> implements OperationinfolistService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OperationinfolistEntity> page = this.page(
                new Query<OperationinfolistEntity>().getPage(params),
                new QueryWrapper<OperationinfolistEntity>()
        );

        return new PageUtils(page);
    }

}