# spring boot实践知识

## 最佳实践

- 引入场景依赖

- - https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-starter

- 查看自动配置了哪些（选做）

- - 自己分析，引入场景对应的自动配置一般都生效了
  - 配置文件中**debug=true**开启自动配置报告。Negative（不生效）\Positive（生效）

- 是否需要修改

- - 参照文档修改配置项

- - - https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#common-application-properties
    - 自己分析。xxxxProperties绑定了配置文件的哪些。

- - 自定义加入或者替换组件

- - - @Bean、@Component。。。

- - 自定义器  **XXXXXCustomizer**；
  - ......

# 开发小技巧

## Lombok

简化JavaBean开发

```java
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>


idea中搜索安装lombok插件
===============================简化JavaBean开发===================================
@NoArgsConstructor
//@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User {

    private String name;
    private Integer age;
    private Pet pet;
    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }
}

================================简化日志开发===================================
@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(@RequestParam("name") String name){   
        log.info("请求进来了...."); 
        return "Hello, Spring Boot 2!"+"你好："+name;
    }
}
```

## dev-tools

```java
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>
```

项目或者页面修改以后：Ctrl+F9；



## Spring Initailizr（项目初始化向导）

### 选择我们需要的开发场景

![image.png](asserts/1602922147241-73fb2496-e795-4b5a-b909-a18c6011a028.png)

### 自动依赖引入

![image.png](asserts/1602921777330-8fc5c198-75da-4ff9-b82c-71ee3fe18af8.png)





### 自动创建项目结构

![image.png](asserts/1602921758313-5099fe18-4c7b-4417-bf6f-2f40b9028296.png)

### 自动编写好主配置类

![image.png](asserts/1602922039074-79e98aad-8158-4113-a7e7-305b57b0a6bf.png)

###### 