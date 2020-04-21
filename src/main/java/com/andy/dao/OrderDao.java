package com.andy.dao;

import com.andy.model.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Andy
 * @date 2020/4/17 15:41
 */
@Mapper
public interface OrderDao {

    int insert(Order order);

    Order selectById(long id);
}
