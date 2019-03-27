package com.study.wrg;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@SpringBootApplication
@EnableTransactionManagement
public class ProjectWebJspApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProjectWebJspApplication.class, args);
    }


    @Autowired
    public ProjectWebJspApplication(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    private Log log = LogFactory.getLog(ProjectWebJspApplication.class);

    private final DataSource dataSource;

    @Value("${spring.profiles.active}")
    private String active;

    @Override
    public void run(String... args) throws Exception {
        log.info("===== start run ...======");
        log.info(" this the spring.profiles.active is "+active);
        if ("dev".equals(active)){
            log.info("开发环境配置，数据源信息：");
            log.info("dataSource is "+dataSource);
            log.info("connection is "+dataSource.getConnection().toString());
        }else if("prod".equals(active)){
            log.info("生产环境配置，数据源信息：");
            log.info("dataSource is "+dataSource);
            log.info("connection is "+dataSource.getConnection().toString());
        }
    }
}
