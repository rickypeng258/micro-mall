package com.ricky.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ricky.mall.goods.model.Brand;

import java.util.List;

/*****
 * @Author: RickyPeng
 * @Description:
 ****/
public interface BrandService extends IService<Brand> {

    /****
     * 条件查询
     * return List<Brand>
     */
    List<Brand> queryList(Brand brand);

    /****
     * 条件分页查询
     * return Page<Brand>
     */
    Page<Brand> queryPageList(Brand brand,Long currentPage,Long size);

    /**
     * 根据BrandId查询brand
     * return Brand
     */

    Brand queryById(int id);

}
