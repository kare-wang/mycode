package kare.testboot.testspringboot.service;

import kare.testboot.testspringboot.domain.User;

import java.util.List;

public interface UserService {

    public List<User> findAllUser();
}
