package com.lcc.japi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 李昌赐
 * @since 2021−05-29
 */
@AllArgsConstructor
@Data
public class UserVO {

    /**
     * 主键标识
     */
    private int id;
    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 说明
     */
    private String comment;
}
