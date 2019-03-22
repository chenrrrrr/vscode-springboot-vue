package com.mooc.demo.service.impl;

import java.util.List;

import com.mooc.demo.bean.User;
import com.mooc.demo.dao.UserMapper;
import com.mooc.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public List<User> selectAll() throws Exception {
    return userMapper.selectAll();
  }

}