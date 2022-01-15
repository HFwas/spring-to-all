package com.hfwas.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hfwas.mybatisplus.entity.GatewayLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 网关日志模块
 *
 * @author gjq
 * @date 2021-05-17 00:10:22
 */
@Mapper
public interface GatewayLogMapper extends BaseMapper<GatewayLog> {

    List<GatewayLog> selectListPage(@Param("systemName") String systemName,
                                    @Param("serviceName") String serviceName,
                                    @Param("logLevel") String logLevel,
                                    @Param("traceId") String traceId,
                                    @Param("develop") String develop,
                                    @Param("startValue") String startValue,
                                    @Param("endValue") String endValue,
                                    @Param("pageNo") Integer pageNo,
                                    @Param("pageSize") Integer pageSize);

    List<GatewayLog> selectListPageTotal(@Param("systemName") String systemName,
                                    @Param("serviceName") String serviceName,
                                    @Param("logLevel") String logLevel,
                                    @Param("traceId") String traceId,
                                    @Param("develop") String develop,
                                    @Param("startValue") String startValue,
                                    @Param("endValue") String endValue);
}
