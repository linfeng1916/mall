package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.ProductAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author linfeng
 * @email 951243590@qq.com
 * @date 2021-06-05 14:49:41
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ProductAttrValueEntity> baseListForSpu(Long spuId);

    void saveProductAttr(List<ProductAttrValueEntity> collect);

    void updateSpuAttr(Long spuId, List<ProductAttrValueEntity> entities);
}

