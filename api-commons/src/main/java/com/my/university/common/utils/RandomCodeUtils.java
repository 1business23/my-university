package com.my.university.common.utils;

/**
 * @Describe 随机生成六位验证码
 * @Author haitao
 * @Date 2021/6/2 11:57
 * @Version 1.0
 */
public class RandomCodeUtils {
    public static String randomCode() {
        int code = (int) ((Math.random() * 9 + 1) * 100000);
        return code + "";
    }
}
