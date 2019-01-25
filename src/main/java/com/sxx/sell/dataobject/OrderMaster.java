package com.sxx.sell.dataobject;

import com.sxx.sell.enums.OrderStatusEnum;
import com.sxx.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName OrderMaster
 * @Description TODO 订单主表
 * @Author syx
 * @Date 2019-01-25 10:14
 * @Version 1.0
 **/
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /** 订单id. */
    @Id
    private String orderId;

    /** 买家姓名. */
    private String buyerName;

    /** 买家电话 */
    private String buyerPhone;

    /** 买家地址 */
    private  String buyerAddress;

    /** 买家微信openId */
    private  String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态 默认0新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态 默认0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}
