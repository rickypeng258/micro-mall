package com.ricky.mall.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*****
 * @Author: RickyPeng
 * @Description: 基于阿里巴巴微服务商城
 ****/
@Configuration
public class StartConfig {

    /****
     * 分页拦截器
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor pageInterceptor = new PaginationInterceptor();
        // 设置数据类型
        pageInterceptor.setDbType(DbType.MYSQL);
        return pageInterceptor;
    }
}
