package com.example.gatewaydemooo.controller.controller;

import com.example.gatewaydemooo.controller.dto.OptionDTO;
import com.example.gatewaydemooo.controller.dto.RequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

/**
 * @Author HFwas
 * @Date 2022/1/20 16:12
 */
@RestController
@RequestMapping("jqhkz")
@Slf4j
public class DemoController {

    @PostMapping("/demo1")
    public String demo1(@RequestBody RequestDTO<OptionDTO> requestDTO){
        log.info("精确化控制传输的参数为：{}" + requestDTO);

        List<OptionDTO> optionalList = requestDTO.getOptionalList();
        log.info("optionalList:{}" + optionalList);
        if (Objects.isNull(optionalList)) {
            return "没有选择精确化控制，那就什么什么也不输出";
        }
        OptionDTO optionDTO = optionalList.get(0);
        if (Integer.parseInt(optionDTO.getFieldValue()) == 1) {
            return "精确化控制选择" + optionDTO.getFieldCn() + "返回一个哈哈哈哈";
        }
        if (Integer.parseInt(optionDTO.getFieldValue()) == 2) {
            return "精确化控制选择" + optionDTO.getFieldCn() + "返回无数个个哈哈哈哈，反正能区分出来！！";
        }
        return "1234";
    }

}
