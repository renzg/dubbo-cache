package me.bohr.dubbo.cache.dto;

import lombok.Data;

/**
 * @author qiuboboy@qq.com
 * @date 2018-07-24 17:52
 */
@Data
public class Request implements java.io.Serializable{
    private String name;
    private int age;
}
