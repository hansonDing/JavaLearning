package com.hansonding.conf;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class SqlSessionFactoryConfiguration {

    @Value("${mybatis_config_file}")
    private String mybatisConfigPath;
    @Value("${mapper_path}")
    private String mapperXMLPath;
    @Value("${entity_package}")
    private String pojoPackage;

    @Autowired
    private DataSource dataSource;

    @Bean(name="sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigPath));

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packMapperXMLPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperXMLPath;

        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packMapperXMLPath));
        sqlSessionFactoryBean.setTypeAliasesPackage(pojoPackage);
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;

    }
}
