package com.andy.service;


import com.andy.model.Order;

/**
 * @author Andy
 * @date 2020/4/17 15:47
 */
public interface OrderService{


    int insert(Order order);

    Order selectById(long id);
}
