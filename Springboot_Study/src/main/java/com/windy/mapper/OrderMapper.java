/*
 * Copyright (c) Windy my copyright message. 2024-2024. All rights reserved. (MIT)
 *
 */

package com.windy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.windy.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
