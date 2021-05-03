package com.hfwas.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hfwas.mybatisplus.entity.User;
import com.hfwas.mybatisplus.entity.UserVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: HFwas
 * @Date: 2021/5/3
 * @Description: com.hfwas.mybatisplus.mapper
 * @version: 1.0
 */
@SpringBootTest
class UsersMapperTest {

    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private UserVOMapper userVOMapper;

    @Test
    void userMappersTest(){
        usersMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void insertTest(){
        User user = new User();
        user.setUserId("C罗");
        user.setDepartmentId(5);
        usersMapper.insert(user);
    }

    @Test
    void updateTest(){
        User user = usersMapper.selectById("1.3891032980148838e18");
        user.setDepartmentId(4);
        usersMapper.updateById(user);
    }

    @Test
    void userVOTest(){
        // 不加热河条件查询
        // userVOMapper.selectList(null).forEach(System.out::println);

        //单条件查询
        QueryWrapper<UserVO> queryWrapper = new QueryWrapper<>();
        //queryWrapper.eq("name","Jone");
        //userVOMapper.selectList(queryWrapper).forEach(System.out::println);

        //多条件查询
//        Map<String, Object> map = new HashMap<>();
//        map.put("name","Billie");
//        map.put("age","24");
//        queryWrapper.allEq(map);

        // age > 20
        //queryWrapper.gt("age","20");
        // age >= 20
        //queryWrapper.ge("age","20");

        // age < 20
//        queryWrapper.lt("age","20");

        // age != 20
        //queryWrapper.ne("age","20");

        //%o%(String)
        // queryWrapper.like("name","o");
        //%e(String)
        //queryWrapper.likeLeft("name","e");
        //J%(String)
        //queryWrapper.likeRight("name","J");

        //inSql
//        queryWrapper.inSql("age","select age from user where age < 22");
//        queryWrapper.inSql("id","select id from user where id > 3");

        //排序
        queryWrapper.orderByDesc("age");
        queryWrapper.having("id > 3");
        userVOMapper.selectList(queryWrapper).forEach(System.out::println);
    }

    @Test
    void testOtherSelect(){
        QueryWrapper<UserVO> wrapper = new QueryWrapper<>();
        //System.out.println(userVOMapper.selectById(4));
//        userVOMapper.selectBatchIds(Arrays.asList(3,4,5)).forEach(System.out::println);

        // map只能做等职判断，逻辑判断需要使用Wrapper来处理
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("id",4);
//        userVOMapper.selectByMap(map);

//        wrapper.gt("age",15);
//        System.out.println(userVOMapper.selectCount(wrapper));

        //wrapper.gt("age","12");
        // 将查询的结果封装到Map集合当中
        //userVOMapper.selectMaps(wrapper).forEach(System.out::println);

        // 分页查询
        Page<UserVO> page = new Page<>(1,2);
        Page<UserVO> voPage = userVOMapper.selectPage(page, null);
        System.out.println(voPage.getSize());
        System.out.println(voPage.getTotal());
        voPage.getRecords().forEach(System.out::println);
    }
}