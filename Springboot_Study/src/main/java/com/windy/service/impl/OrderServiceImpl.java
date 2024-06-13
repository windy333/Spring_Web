/*
 * Copyright (c) Windy my copyright message. 2024-2024. All rights reserved. (MIT)
 *
 */

package com.windy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.windy.entity.Order;
import com.windy.mapper.OrderMapper;
import com.windy.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService{
    @Resource
    private OrderMapper orderMapper;

}
