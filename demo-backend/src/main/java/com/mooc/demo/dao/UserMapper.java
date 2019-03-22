package com.mooc.demo.dao;

import java.util.List;

import com.mooc.demo.bean.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * UserMapper
 */
@Mapper
public interface UserMapper {
  List<User> selectAll();
}