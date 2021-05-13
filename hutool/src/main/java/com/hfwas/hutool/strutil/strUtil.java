package com.hfwas.hutool.strutil;

import cn.hutool.core.util.StrUtil;

/**
 * @Author: HFwas
 * @Date: 2021/5/13
 * @Description: com.hfwas.hutool.strutil
 * hutool中字符串工具的学习
 * @version: 1.0
 */
public class strUtil {
    public static void main(String[] args) {
        String string = "";
        String str = "hello hfwas";

        System.out.println(StrUtil.toString(string));
        System.out.println(StrUtil.isEmpty(string));
        System.out.println(StrUtil.isBlank(string));
        System.out.println(StrUtil.removePrefix("preHello hfwas","pre"));
        System.out.println(StrUtil.removeSuffix("preHello hfwas","hfwas"));
        System.out.println("");

    }
}
