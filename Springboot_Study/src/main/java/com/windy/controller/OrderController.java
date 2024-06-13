/*
 * Copyright (c) Windy my copyright message. 2024-2024. All rights reserved. (MIT)
 *
 */

package com.windy.controller;

import com.windy.common.Result;
import com.windy.entity.Order;
import com.windy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/order")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

//    @GetMapping("/list")
//    public List<Order> list() {
//        return orderService.list();
//    }

    @GetMapping("/list")
    public Result list() {
        List<Order> orders = orderService.list();
        //return Result.suc().data("orders", orders).data("total", orders.size());
        Result result = Result.suc();
        result.setTotal(orders.size());
        result.data("orders", orders);
        return result;
    }

//    @GetMapping("/{id}")
//    public Order getById(@PathVariable("id") String id) {
//        return orderService.getById(id);
//    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable("id") String id) {
        Order order = orderService.getById(id);
        if (order != null) {
            return Result.suc().data("order", order);
        } else {
            return Result.fail();
        }
    }

}
