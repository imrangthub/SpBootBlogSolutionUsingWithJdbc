//package com.imran.config;
//
//import javax.sql.DataSource;
//
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//@Configuration
//@PropertySource("classpath:db.properties")
//public class AppDataSourceConfig {
//
//  @Autowired
//  private Environment env;
//
//  @Bean
//  public DataSource getDataSource() {
//    BasicDataSource dataSource = new BasicDataSource();
//    dataSource.setDriverClassName(env.getProperty("mysql.driver"));
//    dataSource.setUrl(env.getProperty("mysql.jdbcUrl"));
//    dataSource.setUsername(env.getProperty("mysql.username"));
//    dataSource.setPassword(env.getProperty("mysql.password"));
//    return dataSource;
//  }
//  
//  @Bean
//  public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//      JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//      jdbcTemplate.setResultsMapCaseInsensitive(true);
//      return jdbcTemplate;
//  }
//  
//}