package com.zcy;


import com.zcy.dao.YourDiaryMapper;
import com.zcy.entity.YourDiary;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
/**
 * 表示自己是一个服务提供者
 * */
@MapperScan(basePackages = "com.zcy.dao")
@EnableEurekaClient
public class YourDiaryApplication {

    @Autowired
    private static YourDiaryMapper yourDiaryMapper;

    public static void main(String[] args) {
        SpringApplication.run(YourDiaryApplication.class, args);
        //insertOne();
        System.out.println("日记服务提供者启动");
    }


    public static void insertOne(){
        YourDiary diary=new YourDiary();

        yourDiaryMapper.insert(diary);
    }

}
