package org.camille.web.monitor.service.api;

import lombok.Data;

/**
 * @author 彭康
 * @create 2021-05-23 19:45
 **/
@Data
public class Result<T> {

    private int status;

    private String massage;

    private T data;


}
