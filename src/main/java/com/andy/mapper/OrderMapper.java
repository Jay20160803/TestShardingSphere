package com.andy.mapper;

import com.andy.model.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Andy
 * @date 2020/4/17 15:41
 */
@Mapper
public interface OrderMapper {

    int insert(Order order);

    Order selectById(long id);
}
