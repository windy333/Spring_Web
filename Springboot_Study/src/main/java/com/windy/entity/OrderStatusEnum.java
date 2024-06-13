/*
 * Copyright (c) Windy my copyright message. 2024-2024. All rights reserved. (MIT)
 *
 */

package com.windy.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStatusEnum {
    STATUS_0(0,"待付款"),
    STATUS_1(1,"待发货"),
    STATUS_2(2,"待签收"),
    STATUS_3(3,"已签收"),
    STATUS_4(4,"已完成");

    private final int code;
    private final String message;

    OrderStatusEnum(int code, String message) {
        this.code = code;
        this.message=message;
    }

    public int getCode() {
        return code;
    }

    @JsonValue
    public String getMessage() {
        return message;
    }

    //如果你需要将 JSON 数据转换回 OrderStatusEnum 枚举对象，这个方法是必要的。
    @JsonCreator
    public static OrderStatusEnum fromCode(int code) {
        for (OrderStatusEnum status : OrderStatusEnum.values()) {
            if (status.code == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code: " + code);
    }

}
