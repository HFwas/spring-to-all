package com.hfwas.springmvcsrcdemo.convert;

import com.hfwas.springmvcsrcdemo.bean.User;
import com.hfwas.springmvcsrcdemo.mapstruct.UserConvert;
import com.hfwas.springmvcsrcdemo.vo.UserVO;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName UserConvertTest
 * @Description
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 8:47 下午
 * @Version: 1.0
 **/
@SpringBootTest
public class UserConvertTest {

    /**
     * 基本数据类型转换
     */
    @Test
    public void testConvert01(){
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
