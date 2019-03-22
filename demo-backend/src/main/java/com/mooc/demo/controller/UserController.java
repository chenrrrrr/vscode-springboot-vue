package com.mooc.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.mooc.demo.bean.User;
import com.mooc.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */

// @RestController
@Controller
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping("/test")
  public String test() {
    List<User> userList = new ArrayList<>();
    try {
      userList = userService.selectAll();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "test";
  }
}