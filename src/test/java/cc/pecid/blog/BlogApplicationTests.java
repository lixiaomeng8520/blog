package cc.pecid.blog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cc.pecid.blog.mapper.UserMapper;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private UserMapper userMapper;

	@Test
	void contextLoads() {
        System.out.println(userMapper.getUserList().get(0));

	}

}
