package com.bjpowernode.crm.uuid;

import java.util.UUID;

public class UUIDTest {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        System.out.println(uuid);
    }
}
