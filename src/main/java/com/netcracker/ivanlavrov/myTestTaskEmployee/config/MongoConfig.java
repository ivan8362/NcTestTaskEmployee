package com.netcracker.ivanlavrov.myTestTaskEmployee.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.netcracker.ivanlavrov.myTestTaskEmployee.repository")
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName(){
        return "test";
    }

    @Override
    public MongoClient mongoClient(){
        return new MongoClient("127.0.0.1", 27017);
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.netcracker.ivanlavrov.myTestTaskEmployee";
    }
}
