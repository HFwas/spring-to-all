package com.example.gatewaydemooo.controller.support;

import com.example.gatewaydemooo.controller.dto.OptionDTO;
import com.example.gatewaydemooo.controller.dto.RequestDTO;
import com.example.gatewaydemooo.controller.vo.DataVO;
import com.example.gatewaydemooo.controller.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author HFwas
 * @Date 2022/1/20 11:38
 */
@RestController
@RequestMapping("/contro")
public class JXHKZController {

    @GetMapping("/return/index")
    public ResultVO returnIndex(){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(true);
        resultVO.setResponseCD(1);
        resultVO.setResponseMsg("操作成功");

        List<DataVO> dataVOS = new ArrayList<>();
        DataVO dataVO = new DataVO();
        dataVO.setId("13877298-318e-4c2d-ae93-dcdad08bbf47");
        dataVO.setFieldname4cn("河流别名");
        dataVOS.add(dataVO);

        DataVO dataVO2 = new DataVO();
        dataVO2.setId("abfecdb2-e1b6-4a06-8647-199ab242d86a");
        dataVO2.setFieldname4cn("跨界类型");
        dataVOS.add(dataVO2);
        resultVO.setData(dataVOS);

        return resultVO;
    }

    @GetMapping("/request/index")
    public ResultVO requestIndex(){
        ResultVO<RequestDTO> requestDTO = new ResultVO<>();
        requestDTO.setSuccess(true);
        requestDTO.setResponseCD(1);
        requestDTO.setResponseMsg("操作成功");
        requestDTO.setTotalCount(null);
        requestDTO.setShowVideo1(false);
        requestDTO.setShowVideo2(false);
        requestDTO.setShowRel(false);


        ArrayList<RequestDTO> dtos = new ArrayList<>();
        RequestDTO dto1 = new RequestDTO();
        dto1.setCode("RV_TYPE");
        dto1.setName("河流类型");
        dto1.setElementid("855b2770-46fb-11e9-92f6-00ff005e7c26");
        dto1.setCompareType(3);
        dto1.setDisplayType(6);
        dto1.setDisplaystyle(2);

        ArrayList<OptionDTO> arrayList = new ArrayList<>();
        OptionDTO optionDTO = new OptionDTO();
        optionDTO.setFieldValue("1");
        optionDTO.setFieldCn("自然流域河流");
        arrayList.add(optionDTO);
        OptionDTO optionDTO2 = new OptionDTO();
        optionDTO2.setFieldValue("2");
        optionDTO2.setFieldCn("区间流域河流");
        arrayList.add(optionDTO2);
        dto1.setOptionalList(arrayList);
        dtos.add(dto1);

        requestDTO.setData(dtos);
        return requestDTO;
    }

}
