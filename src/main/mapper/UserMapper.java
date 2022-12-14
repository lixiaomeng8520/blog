package cc.pecid.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cc.pecid.blog.domain.User;

@Mapper
public interface UserMapper {

    public List<User> getUserList();
    
}
