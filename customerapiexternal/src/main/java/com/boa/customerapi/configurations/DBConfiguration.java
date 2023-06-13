package com.boa.customerapi.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(VaultConfiguration.class)
public class DBConfiguration {

    @Value("${db_url_v3}")
    private String dbUrl;
    @Value("${db_driver}")
    private String driver;

    private DataSourceBuilder dataSourceBuilder;
    private final VaultConfiguration vaultConfiguration;

    public DBConfiguration (VaultConfiguration vaultConfig)
    {
        this.vaultConfiguration=vaultConfig;
    }


    @Bean

    public DataSource getDataSource()
    {
        System.out.println("Entering Given Env.....");
        System.out.println("User Name..."+vaultConfiguration.getUsername());
        System.out.println("Password..."+vaultConfiguration.getPassword());
        dataSourceBuilder=DataSourceBuilder.create();
        dataSourceBuilder.url(dbUrl);
        dataSourceBuilder.username(vaultConfiguration.getUsername());
        dataSourceBuilder.password(vaultConfiguration.getPassword());
        dataSourceBuilder.driverClassName(driver);
        return dataSourceBuilder.build();

    }



}
