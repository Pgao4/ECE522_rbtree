package com.fei.kyromall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fei.common.utils.PageUtils;
import com.fei.kyromall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author PengfeiGao
 * @email sunlightcs@gmail.com
 * @date 2021-12-28 20:57:41
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

