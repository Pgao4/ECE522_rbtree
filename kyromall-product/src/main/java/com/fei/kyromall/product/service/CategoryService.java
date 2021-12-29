package com.fei.kyromall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fei.common.utils.PageUtils;
import com.fei.kyromall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author PengfeiGao
 * @email sunlightcs@gmail.com
 * @date 2021-12-28 20:57:42
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

