package com.liu.smallProgram.talkHall.utils;

import com.alibaba.druid.support.json.JSONUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Liu Zhaoyang
 * @author other authors
 * @version V1.00   2016/12/16   16:34   Liu Zhaoyang  created
 * @description 用来进行 操作成功或者操作失败以后  反馈给前端的值的包装处理
 * @history
 */
public class ResultHandle {
    /**
     * 该函数直接将  传入的msg（string） 填入map的msg
     * @param map
     * @param msg
     */
    public static void setResultMapSucceed(Map<String,Object>map,String msg){
        map.put("result","succeed");
        map.put("msg",msg);
    }

    /**
     * 该函数直接将  传入的msg（string） 填入map的msg
     * @param map
     * @param msg
     */
    public static void setResultMapFailed(Map<String,Object>map,String msg){
        map.put("result","failed");
        map.put("msg",msg);
    }

    /**
     * 该函数使用默认的 msg     {msg:"{info:xxxxxxx}"}
     * @param map
     * @param original
     */
    public static void setResultMapSucceedOriginal(Map<String,Object>map,String original){
        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("info",original);
        String msg = JSONUtils.toJSONString(map1);
        map.put("result","succeed");
        map.put("msg",msg);
    }

    /**
     * 该函数使用默认的 msg     {msg:"{info:xxxxxxx}"}
     * @param map
     * @param original
     */
    public static void setResultMapFailedOriginal(Map<String,Object>map,String original){
        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("info",original);
        String msg = JSONUtils.toJSONString(map1);
        map.put("result","failed");
        map.put("msg",msg);
    }
}
