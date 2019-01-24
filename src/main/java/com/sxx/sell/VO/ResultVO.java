package com.sxx.sell.VO;

import lombok.Data;

/**
 * @ClassName ResultVO
 * @Description TODO http请求返回的最外层对象
 * @Author syx
 * @Date 2019-01-23 16:57
 * @Version 1.0
 **/
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //返回的具体内容
    private T data;
}
