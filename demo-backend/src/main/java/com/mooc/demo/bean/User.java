package com.mooc.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * User
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
  private int id;
  private String username;
  private String password;

}