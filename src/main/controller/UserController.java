package cc.pecid.blog.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.pecid.blog.domain.User;
import cc.pecid.blog.mapper.UserMapper;

@RestController
@RequestMapping("/user")
public class UserController {

    //数据源组件
    @Autowired
    DataSource dataSource;
    //用于访问数据库的组件
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserMapper userMapper;

    @Autowired
    RedisTemplate redisTemplate;
    
    @RequestMapping("/list")
    public void list() throws SQLException {
        // System.out.println(dataSource.getClass());
        // System.out.println(jdbcTemplate.queryForObject("select count(*) from users", Integer.class));

        // List<User> userList = userMapper.getUserList();
        // System.out.println(userList);
        // return SecurityContextHolder.getContext().getAuthentication().getName();
        
        // redisTemplate.opsForValue().set( "user:11", new User(11, "lixiaomeng"), 3660, TimeUnit.SECONDS);
        // System.out.println(((User)redisTemplate.opsForValue().get("user:11")).getName()); 

        // System.out.println();
        System.out.println("/user/list");
    }

    @PostMapping("/add")
    public void add() {
        System.out.println("/user/add");
    }

}
