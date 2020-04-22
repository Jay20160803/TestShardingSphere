package com.andy.service.impl;

import com.andy.mapper.OrderMapper;
import com.andy.model.Order;
import com.andy.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Andy
 * @date 2020/4/17 15:48
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;


    @Override
    public int insert(Order order) {
        return orderMapper.insert(order);
    }

    @Override
    public Order selectById(long id) {
        return orderMapper.selectById(id);
    }
}
