package com.fei.kyromall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fei.common.utils.PageUtils;
import com.fei.kyromall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author PengfeiGao
 * @email sunlightcs@gmail.com
 * @date 2021-12-28 20:57:42
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

