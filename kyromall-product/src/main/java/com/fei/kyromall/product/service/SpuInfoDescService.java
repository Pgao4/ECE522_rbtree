package com.fei.kyromall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fei.common.utils.PageUtils;
import com.fei.kyromall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author PengfeiGao
 * @email sunlightcs@gmail.com
 * @date 2021-12-28 20:57:42
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

