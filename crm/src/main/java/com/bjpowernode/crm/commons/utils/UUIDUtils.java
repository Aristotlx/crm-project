package com.bjpowernode.crm.commons.utils;

import java.util.UUID;

public class UUIDUtils {
    /**
     * 获取 uuid 的值
     * @return
     */
    public static String getUUID(){
       return UUID.randomUUID().toString().replaceAll("-","");
    }
}
