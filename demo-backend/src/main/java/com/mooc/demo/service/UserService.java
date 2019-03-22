package com.mooc.demo.service;

import java.util.List;

import com.mooc.demo.bean.User;

/**
 * UserService
 */
public interface UserService {

  /**
   * 查询全部用户
   */
  List<User> selectAll() throws Exception;

}