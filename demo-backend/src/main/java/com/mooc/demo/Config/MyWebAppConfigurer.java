package com.mooc.demo.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MyWebAppConfigurer
 */
@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {

  @Value("${localUploadPath}")
  private String localUploadPath; // 这里是在application.properties配置的本地存储路径，为了解耦

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    // 所有 前端 发来以 /media/开头请求的资源，全部指向本地 'D:/uoloadFile' 路径
    registry.addResourceHandler("/media/**").addResourceLocations("file:" + localUploadPath);
  }
}