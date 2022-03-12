package com.hfwas.main.mapstruct;

import com.hfwas.main.bean.User;
import com.hfwas.main.dto.UserDTO;
import com.hfwas.main.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @ClassName UserConvert
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 7:46 下午
 * @Version: 1.0
 **/
@Mapper
public interface UserConvert {

    UserVO convertUserVO(User user);

    /**
     * 测试字段名称不一致 id -> userId
     * @param user
     * @return
     */
//    @Mapping(source = "id", target = "userId")
    UserVO convertUser(User user);

    UserDTO convertUserDTO(User user);

    /**
     * 类型不一致转换
     * @param user id 类型不一致
     * @return
     */
    UserVO convertUserVOByStringToLong(User user);

    /**
     * StringToLocalDateTime: string -> localdatetime
     * @param user
     * @return
     */
    UserVO convertUserVOByStringToLocalDateTime(User user);

    /**
     * LocalDateTimeToString： localdatetime -> string
     * @param userVO
     * @return
     */
    User convertUserVOByLocalDateTimeToString(UserVO userVO);




}
