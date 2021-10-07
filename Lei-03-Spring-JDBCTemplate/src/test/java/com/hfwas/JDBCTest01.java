package com.hfwas;

import com.hfwas.bean.Employee;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

/**
 * @ClassName JDBCTest01
 * @Description
 * @Author hfwas
 * @Date:2021/10/6 11:25 下午
 * @Version: 1.0
 **/
public class JDBCTest01 {
    private static final ApplicationContext APPLICATION_CONTEXT = new ClassPathXmlApplicationContext("applicationContext.xml");
    JdbcTemplate jdbcTemplate = APPLICATION_CONTEXT.getBean(JdbcTemplate.class);
    NamedParameterJdbcTemplate namedParameterJdbcTemplate = APPLICATION_CONTEXT.getBean(NamedParameterJdbcTemplate.class);

    public static void main(String[] args) {

    }

    /*实验7：使用带有具名参数的SQL语句插入一条员工记录，并以Map形式传入参数值
    * 测试有问题。
    * */
    @Test
    public void test07(){
        NamedParameterJdbcTemplate namedParameterJdbcTemplate1 = (NamedParameterJdbcTemplate) APPLICATION_CONTEXT.getBean("namedParameterJdbcTemplate");
        System.out.println(namedParameterJdbcTemplate1);
        System.out.println(this.namedParameterJdbcTemplate);
//        String sql = "INSERT INTO employee(emp_name,salary) VALUES (:empName,:salary)";
//        Map<String,Object> map = new HashMap<>();
//        map.put("empName","hahha");
//        map.put("salary",89898);
//        int update = namedParameterJdbcTemplate.update(sql, map);
//        System.out.println(update);
    }

    /*实验6：查询最大salary*/
    @Test
    public void test06(){
        String sql = "SELECT MAX(salary) from employee ;";
        Double aDouble = jdbcTemplate.queryForObject(sql, Double.class);
        System.out.println(aDouble);
    }

    /*实验5：查询salary>4000的数据库记录，封装为List集合返回*/
    @Test
    public void test05(){
        String sql = "SELECT emp_id empId,emp_name empName,salary from employee where salary>?";
        List<Employee> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class), 4000);
        query.forEach(System.out::println);
    }

    /*实验4：查询emp_id=5的数据库记录，封装为一个Java对象返回*/
    @Test
    public void test04(){
        String sql = "SELECT emp_id empId,emp_name empName,salary from employee where emp_id=?";
        Employee employee = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Employee.class), 5);
        System.out.println(employee);
    }

    /*实验3：批量插入*/
    @Test
    public void test03(){
        ArrayList<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"张三",7878});
        list.add(new Object[]{"王武",787888888});
        list.add(new Object[]{"六三",878});
        list.add(new Object[]{"里斯",78});
        int[] ints = jdbcTemplate.batchUpdate("INSERT INTO employee(emp_name,salary) VALUES (?,?)", list);
        System.out.println(Arrays.asList(ints));
    }

    /*实验2：将emp_id=5的记录的salary字段更新为1300.00*/
    @Test
    public void test02(){
//        System.out.println(jdbcTemplate);
        int update = jdbcTemplate.update("UPDATE employee SET salary=? WHERE emp_id=?", 32323, 5);
        System.out.println(update);

    }

    @Test
    public void tesDt01() throws SQLException {
        DataSource bean = APPLICATION_CONTEXT.getBean(DataSource.class);
        Connection connection = bean.getConnection();
        System.out.println(connection);
        connection.close();
    }



}
