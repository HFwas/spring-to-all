package com.hfwas.main.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hfwas.main.bean.InfraApiErrorLog;
import com.hfwas.main.convert.InfraApiErrorLogConvert;
import com.hfwas.main.dto.InfraApiErrorLogDTO;
import com.hfwas.main.mapper.InfraApiErrorLogMapper;
import com.hfwas.main.service.InfraApiErrorLogService;
import com.hfwas.main.vo.InfraApiErrorLogVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName RuoController
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 2:04 上午
 * @Version: 1.0
 **/
@RestController
@RequestMapping("api")
public class RuoController {

    @Autowired
    private InfraApiErrorLogService infraApiErrorLogService;

    @GetMapping("/list")
    public List<InfraApiErrorLog> list(){
        List<InfraApiErrorLog> infraApiErrorLogs = infraApiErrorLogService.list();
        System.out.println(infraApiErrorLogs);
        return infraApiErrorLogs;
    }

    @PostMapping("/list/query")
    public List<InfraApiErrorLogVO> listForQuery(@RequestBody @Validated InfraApiErrorLogDTO infraApiErrorLogDTO){
        List<InfraApiErrorLog> apiErrorLogs = infraApiErrorLogService.list(Wrappers.lambdaQuery(InfraApiErrorLog.class)
                .eq(InfraApiErrorLog::getId, infraApiErrorLogDTO.getId())
                .eq(InfraApiErrorLog::getRequestMethod, infraApiErrorLogDTO.getUserId())
                .eq(InfraApiErrorLog::getTraceId, infraApiErrorLogDTO.getTraceId()));
        List<InfraApiErrorLogVO> infraApiErrorLogVOS = InfraApiErrorLogConvert.INFRA_API_ERROR_LOG_CONVERT.convertInfraApiErrorLogVO(apiErrorLogs);
        return infraApiErrorLogVOS;
    }


}
