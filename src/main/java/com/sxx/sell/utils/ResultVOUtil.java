package com.sxx.sell.utils;

import com.sxx.sell.VO.ResultVO;

/**
 * @ClassName ResultVOUtil
 * @Description TODO
 * @Author syx
 * @Date 2019-01-24 16:29
 * @Version 1.0
 **/
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(200);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static  ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setMsg(msg);
        resultVO.setCode(code);
        return resultVO;
    }

}
