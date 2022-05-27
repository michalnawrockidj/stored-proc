package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void testVeryComplicatedLogic() throws InterruptedException {
        User u = userService.veryComplicatedLogic("Expected Name", 11);
        Assert.isTrue(u.getAge().equals(18), "Age is 18");
        Assert.isTrue(u.getName().equals("Expected Name"), "The name should be marked as xxx");
    }

    @Test
    void testVeryComplicatedLogicAll() throws InterruptedException {
        User u = userService.veryComplicatedLogicAll ("Expected Name", 11);
        Assert.isTrue(u.getAge().equals(18), "Age is 18");
        Assert.isTrue(u.getName().equals("xxx"), "The name should be marked as xxx");
    }

}
