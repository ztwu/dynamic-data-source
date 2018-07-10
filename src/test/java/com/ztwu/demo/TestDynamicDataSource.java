package com.ztwu.demo;

import com.edu.demo.model.dto.User;
import com.edu.demo.service.IServiceTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * User: ztwu2
 * Date: 2018/7/10
 * Time: 11:32
 * Description
 */

public class TestDynamicDataSource extends AbstractTestCase {
    @Autowired
    IServiceTest serviceTest;

    @Test
    public void testAdd(){
        serviceTest.addUser(20,"ztwu6");
    }

    @Test
    public void testGetList(){
        List<User> users = serviceTest.getUserList();
        for(User user:users){
            System.out.println(user.getId()+":"+user.getName());
        }
    }

}
