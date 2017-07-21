package com.boot.baofoo.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by BF100395 on 2017/7/12.
 */
@Configuration
@MapperScan(basePackages="com.boot.baofoo.mapper")
public class MyBatisConfig {

    @Autowired
    private Environment env;

    /**
     * 根据配置文件创建数据源
     * @return 数据源
     * @throws Exception
     */
    @Bean
    public DataSource getDataSource() throws Exception{
        Properties props = new Properties();
        props.put("driverClassName", env.getProperty("jdbc.driverClassName"));
        props.put("url", env.getProperty("jdbc.url"));
        props.put("username", env.getProperty("jdbc.username"));
        props.put("password", env.getProperty("jdbc.password"));
        return DruidDataSourceFactory.createDataSource(props);
    }

    /**
     * 创建SqlSessionFactory
     * @param dataSource
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);

        sqlSessionFactory.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(
                env.getProperty("mybatis.mapperLocations")));

        return sqlSessionFactory.getObject();
    }
}
