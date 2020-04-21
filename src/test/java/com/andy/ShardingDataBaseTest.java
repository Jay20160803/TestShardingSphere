package com.andy;

import com.andy.model.Order;
import com.andy.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Andy
 * @date 2020/4/17 15:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={Application.class})// 指定启动类
public class ShardingDataBaseTest {

    @Autowired
    private OrderService orderService;

    /**
     * 数据分片测试(分库，分表)，插入
     * */
    @Test
    public void testSave(){

        for(int i=0;i<100;i++){
            Order order = new Order();
            order.setId((long) i);
            order.setName("电脑"+i);
            order.setType("办公");
            orderService.insert(order);
        }
    }

    /**
     * 数据分片测试(分库，分表)，查询
     * */
    @Test
    public void testGetById(){
        long id = 1251069991529857025L;
        Order order  = orderService.selectById(id);
        System.out.println(order.toString());
    }
}
