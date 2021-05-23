package org.camille.monitor.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.camille.monitor.dao.pojo.User;

/**
 * @author 彭康
 * @create 2021-05-23 20:23
 **/
@Mapper
public interface UserDao {


    User selectByUsername(@Param("username") String username);

    Integer insertUser(@Param("user") User user);



}
