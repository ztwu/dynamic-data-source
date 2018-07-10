package com.edu.demo.service;

import com.edu.demo.model.dto.User;
import com.edu.demo.util.DataSource;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * User: ztwu2
 * Date: 2018/7/10
 * Time: 11:21
 * Description
 */
public interface IServiceTest {

    @DataSource("write")
    void addUser(int id, String name);

    @DataSource("read")
    List<User> getUserList();
}
