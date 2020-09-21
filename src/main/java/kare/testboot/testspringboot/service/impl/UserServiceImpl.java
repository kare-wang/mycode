package kare.testboot.testspringboot.service.impl;

import kare.testboot.testspringboot.domain.User;
import kare.testboot.testspringboot.mapper.UserMapper;
import kare.testboot.testspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserMapper userMapper;

    public List<User> findAllUser()
    {
        List<User> list = userMapper.findAll();

        return list ;
    }
}
