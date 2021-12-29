package com.fei.kyromall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fei.common.utils.PageUtils;
import com.fei.kyromall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author PengfeiGao
 * @email sunlightcs@gmail.com
 * @date 2021-12-28 20:57:42
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

