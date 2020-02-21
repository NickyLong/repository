package com.store.utils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;

import java.util.Map;

public class MyBeanUtils {

    public static void populate(Object bean, Map<String, String[]> properties){
        try{
            DateConverter dateConverter = new DateConverter();
            dateConverter.setPatterns(new String[]{"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss"});
            ConvertUtils.register(dateConverter, java.util.Date.class);
            BeanUtils.populate(bean, properties);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
