package com.mooc.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FileController
 */
@RestController
public class FileController {

  @Value("${localUploadPath}")
  private String ROOT_PATH;

  @RequestMapping(value = "/upload", method = RequestMethod.POST)
  public String upload(@RequestParam(value = "file") MultipartFile file) {
    // 获取多部分解析对象文件名，参数file
    String fileName = file.getOriginalFilename();
    // 截取后缀
    String suffixName = fileName.substring(fileName.lastIndexOf("."));
    // 重命名文件，防覆盖
    fileName = UUID.randomUUID() + suffixName;
    // File对象转移到 本地持久化存储的路径
    File dest = new File(ROOT_PATH + fileName);
    try {
      // 转移文件
      file.transferTo(dest);
      // 转移成功，若干写入数据库存储的代码省略
      // ...
    } catch (Exception e) {
      e.printStackTrace();
    }
    return fileName;
  }

}