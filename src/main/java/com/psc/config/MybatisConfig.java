package com.psc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: pushicheng
 * @Date: 2022/09/05/14:58
 * @Description: Mybatis配置
 */
@Configuration
@MapperScan("com.psc.dao")
public class MybatisConfig {

}
