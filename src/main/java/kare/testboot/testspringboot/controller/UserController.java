package kare.testboot.testspringboot.controller;


import kare.testboot.testspringboot.domain.User;
import kare.testboot.testspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping("getuser")
    public User getuserinfo()
    {
        User user = new User();
        user.setUsername("张三丰");
        user.setAddress("江西抚州");
        return user;
    }

    @RequestMapping("list2")
    public List<User> list2()
    {
        List<User> list =  userService.findAllUser();
        return list;
    }

}
