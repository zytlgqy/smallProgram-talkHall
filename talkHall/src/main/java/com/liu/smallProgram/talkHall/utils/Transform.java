package com.liu.smallProgram.talkHall.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Liu Zhaoyang
 * @author other authors
 * @version V1.00   2016/12/21   16:44   Liu Zhaoyang  created
 * @description  该类用来进行类型转换，一般是将  model -> entity
 * @history
 */
// TODO: 2016/12/21 实现这个类型转换的类  用java的映射吧
public class Transform {
    /**
     * 该函数是用来将 model  转成 entity 的函数
     * 该函数处理非String类型时候可能出错，待验证    尤其是处理浮点数和日期类型时候！！！
     * @param model
     * @param entity
     * @param <T>
     * @param <K>
     */
    public static<T,K> void TransformModelToEntity(T model, K entity){
        Class modelClass = model.getClass();
        Class entityClass = entity.getClass();
        Field [] entityFields = entityClass.getDeclaredFields();
        Field [] modelFields = modelClass.getDeclaredFields();
        String tmpName,tmp2Name;
        for (Field tmp : entityFields){
            tmpName = tmp.getName();
            for (Field tmp2:modelFields){
                tmp2Name = tmp2.getName();
                try {
                    if(null == getGetFunctionOfBean(modelClass,tmp2Name).invoke(model))
                        continue;
                    if (tmpName.equals(tmp2Name)){
                        getSetFunctionOfBean(entityClass,tmpName,tmp.getType()).invoke(entity,getGetFunctionOfBean(modelClass,tmp2Name).invoke(model));
                    }
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 获取 Get 函数
     * @param bean
     * @param fieldName
     * @return
     */
    private static  Method getGetFunctionOfBean(Class bean,String fieldName){
        String strGet = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());
        Method methodGet = null;
        try {
            methodGet = bean.getDeclaredMethod(strGet);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return  methodGet;
    }

    /**
     * 获取 Set 函数
     * @param bean
     * @param fieldName
     * @param argTypeClass
     * @return
     */
    private static  Method getSetFunctionOfBean(Class bean,String fieldName,Class argTypeClass) {
        String strSet = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1, fieldName.length());
        Method methodSet = null;
        try {
            methodSet = bean.getDeclaredMethod(strSet,argTypeClass);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return  methodSet;
    }
}


