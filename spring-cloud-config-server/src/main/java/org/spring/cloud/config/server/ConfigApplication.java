package org.spring.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
@Slf4j
public class ConfigApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConfigApplication.class, args);
        log.info("配置中心启动成功");
    }
}
