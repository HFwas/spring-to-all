package com.hfwas.main;

import com.hfwas.main.bean.User;
import com.hfwas.main.mapstruct.UserConvert;
import com.hfwas.main.vo.UserVO;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootTest
class ApplicationTests {

    /**
     * 不同数据类型转换
     * string -> localdatetime
     * 1.符合格式自动转换成功
     * 2.不符合格式，就会报错：DateTimeParseException
     */
    @Test
    void LocaldateTimeToStringConvert(){
        UserVO vo = new UserVO();
        vo.setUpdateTime(LocalDateTime.now());
        UserConvert INSTANCE = Mappers.getMapper( UserConvert.class );

        User user = INSTANCE.convertUserVOByLocalDateTimeToString(vo);
        System.out.println(user);
    }

    /**
     * 不同数据类型转换
     * string -> localdatetime
     * 1.符合格式自动转换成功
     * 2.不符合格式，就会报错：DateTimeParseException
     */
    @Test
    void StringLocaldateTimeConvert(){
        User user = new User();
        user.setUpdateTime("2019-11-19T15:16:17");
        UserConvert INSTANCE = Mappers.getMapper( UserConvert.class );

        UserVO userVO = INSTANCE.convertUserVOByStringToLocalDateTime(user);
        System.out.println(userVO);

        User user1 = new User();
        user1.setUpdateTime("2019-11-19 15:16:17");
        // java.time.format.DateTimeParseException: Text '2019-11-19 15:16:17' could not be parsed at index 10
        UserVO userVO1 = Mappers.getMapper(UserConvert.class).convertUserVOByStringToLocalDateTime(user1);
        System.out.println(userVO1);
    }

    /**
     * 不同数据类型转换
     * id : string -> long
     */
    @Test
    void differtTypeConvert(){
        User user = new User();
        user.setId("9");
        UserConvert INSTANCE = Mappers.getMapper( UserConvert.class );

        UserVO userVO = INSTANCE.convertUserVOByStringToLong(user);
        System.out.println(userVO);
    }

    /**
     * 基本数据类型转换
     */
    @Test
    void contextLoads() {
        User user = new User();
        user.setName("houfei");
        user.setAge(24);
        user.setAddress("北京");
        user.setRealName("张三");
        user.setRoleIdList(Arrays.asList("1","2","3"));
        UserConvert INSTANCE = Mappers.getMapper( UserConvert.class );

        UserVO userVO = INSTANCE.convertUserVO(user);
        System.out.println(userVO);
    }

}
