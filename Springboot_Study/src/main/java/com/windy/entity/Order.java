
package com.windy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Data;

@TableName("forms")
@Data
public class Order {
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    private Integer status;
    /**
     * 0: 待付款
     * 1: 待发货
     * 2: 待收货
     * 3: 已签收
     * 4：已完成
     */
    private String goodsName;
    private String userId;

    @JsonGetter("statusMessage")
    public String getStatusMessage() {
        if (status != null) {
            return OrderStatusEnum.fromCode(status).getMessage();
        }
        return null;
    }

}
