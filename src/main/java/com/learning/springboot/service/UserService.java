package com.learning.springboot.service;

import com.learning.springboot.model.Users;
import com.learning.springboot.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // please create a object/bean of this class
public class UserService {

    private UsersRepository usersRepository;

    @Autowired
    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<String> fetchAllUser() {
        List<String> name = new ArrayList<>();
        name.add("Mohit");
        name.add("Karan");
        return name;
    }

    public void addUser(Users users) {
        usersRepository.save(users);
    }
}
