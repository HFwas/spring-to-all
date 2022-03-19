package com.hfwas.springlog.utils;

import io.lettuce.core.tracing.TraceContext;

/**
 * @ClassName TracerUtils
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 11:57 下午
 * @Version: 1.0
 **/
public class TracerUtils {

    /**
     * 私有化构造方法
     */
    private TracerUtils() {
    }

    /**
     * 获得链路追踪编号，直接返回 SkyWalking 的 TraceId。
     * 如果不存在的话为空字符串！！！
     *
     * @return 链路追踪编号
     */
    public static String getTraceId() {
//        return TraceContext.traceId();
        return "121212";
    }

}
