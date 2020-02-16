package com.shop.napkins.config;

import com.mongodb.MongoClient;
//import com.mongodb.client.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories({"com.shop.napkins.*.components.dataaccess.repository"})
@Configuration
public class MongoConnectionConfiguration {

    @Autowired
    private Environment env;

    @Bean
    public MongoClient mongoClient() {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://testapp:eHhk3kbBND63Gi71@cluster0-shard-00-00-qxtyf.mongodb.net:27017,cluster0-shard-00-01-qxtyf.mongodb.net:27017,cluster0-shard-00-02-qxtyf.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true&w=majority"));
        return mongoClient;
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoClient(),"napkins_shop");
        return mongoTemplate;
    }

}
