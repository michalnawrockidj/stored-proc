package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service

public class UserService {

    @Autowired
    UserRepository userRepository;

    @Transactional
    public User veryComplicatedLogic(String name, Integer age) throws InterruptedException {
        User u = new User();
        u.setAge(age);
        u.setName(name);
        u.setTime(LocalDateTime.now());
        userRepository.save(u);
        Thread.sleep(3000);
        userRepository.updateNames(LocalDateTime.now());

        Thread.sleep(3000);
        u.setAge(18);
        u.setTime(LocalDateTime.now());
        return userRepository.save(u);

    }

    @Transactional
    public User veryComplicatedLogicP1(String name, Integer age) throws InterruptedException {
        User u = new User();
        u.setAge(age);
        u.setName(name);
        u.setTime(LocalDateTime.now());
        userRepository.save(u);
        Thread.sleep(3000);
        return u;

    }

    @Transactional
    public void veryComplicatedLogicP2() throws InterruptedException {
        userRepository.updateNames(LocalDateTime.now());
    }

    @Transactional
    public User veryComplicatedLogicP3(Integer id) throws InterruptedException {
        User u = userRepository.findById(id).get();
        Thread.sleep(3000);
        u.setAge(18);
        u.setTime(LocalDateTime.now());
        return userRepository.save(u);

    }

    public User veryComplicatedLogicAll(String name, Integer age) throws InterruptedException {

        User u = this.veryComplicatedLogicP1(name, age);
        this.veryComplicatedLogicP2();
        return this.veryComplicatedLogicP3(u.getId());

    }

}
