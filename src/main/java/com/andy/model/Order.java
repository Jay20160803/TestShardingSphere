package com.andy.model;

import lombok.Data;

import java.util.Date;

/**
 * @author Andy
 * @date 2020/4/17 15:30
 */
@Data
public class Order {
    private Long id;
    private String name;
    private String type;
    private Date gmtCreate;
}
