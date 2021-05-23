package org.camille.monitor.dao.pojo;

import lombok.Data;

/**
 * @author 彭康
 * @create 2021-05-23 20:25
 **/
@Data
public class User {

    private int id;

    private String username;

    private String password;

    private String salt;



}
