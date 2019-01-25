package com.sxx.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @ClassName OrderDetail
 * @Description TODO 订单详情表
 * @Author syx
 * @Date 2019-01-25 11:00
 * @Version 1.0
 **/
@Entity
@Data
public class OrderDetail {

    /** 订单详情Id */
    @Id
    private String detailId;

    /** 订单主表Id */
    private  String orderId;

    /** 商品 Id */
    private String productId;

    /** 商品名称 */
    private String productName;

    /** 商品价格 */
    private BigDecimal productPrice;

    /** 商品数量 */
    private Integer productQuantity;

    /** 商品小图 */
    private  String productIcon;
}
