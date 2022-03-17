package com.hfwas.main.convert;

import com.hfwas.main.bean.InfraApiErrorLog;
import com.hfwas.main.vo.InfraApiErrorLogVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @ClassName InfraApiErrorLogConvert
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 2:58 上午
 * @Version: 1.0
 **/
@Mapper
public interface InfraApiErrorLogConvert {

    InfraApiErrorLogConvert INFRA_API_ERROR_LOG_CONVERT = Mappers.getMapper( InfraApiErrorLogConvert.class );

    List<InfraApiErrorLogVO> convertInfraApiErrorLogVO(List<InfraApiErrorLog> infraApiErrorLogs);

}
