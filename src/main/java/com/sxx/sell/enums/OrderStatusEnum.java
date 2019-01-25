package com.sxx.sell.enums;

import lombok.Getter;
/**
 * @Author
 * @Description //TODO 订单状态
 * @Date 10:46 2019-01-25
 * @Param
 * @return
**/
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消"),
    ;


    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
