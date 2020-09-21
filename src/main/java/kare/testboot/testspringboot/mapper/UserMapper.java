package kare.testboot.testspringboot.mapper;

import kare.testboot.testspringboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper
{
    public List<User> findAll();
}
