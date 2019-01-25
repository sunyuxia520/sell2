package com.sxx.sell.service;

import com.sxx.sell.dto.OrderDTO;

public interface OrderService {

    /** 创建订单 */
    OrderDTO create(OrderDTO orderDTO);

    /** 查询单个订单 */
    OrderDTO findOne(String orderId);

    /** 查询列表订单 */
//    OrderDTO List<>

}
