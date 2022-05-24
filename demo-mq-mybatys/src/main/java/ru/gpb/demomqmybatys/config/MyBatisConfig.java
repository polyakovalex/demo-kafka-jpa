package ru.gpb.demomqmybatys.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"ru.gpb.demomqmybatys.mapper"})
public class MyBatisConfig {

}
