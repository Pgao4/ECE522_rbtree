package com.fei.kyromall.product.dao;

import com.fei.kyromall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author PengfeiGao
 * @email sunlightcs@gmail.com
 * @date 2021-12-28 20:57:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
