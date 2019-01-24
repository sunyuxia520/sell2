package com.sxx.sell.enums;

import lombok.Getter;

/**
 * @Author
 * @Description //TODO 商品状态
 * @Date 15:26 2019-01-23
 * @Param
 * @return
**/
@Getter
public enum ProductStatusEnum {
    UP(0,"上架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
