package com.edu.demo.service;

import com.edu.demo.dao.DaoTest;
import com.edu.demo.model.dto.User;
import com.edu.demo.util.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * User: ztwu2
 * Date: 2018/7/10
 * Time: 11:20
 * Description
 */
@Service
public class ServiceTest implements IServiceTest {

    @Autowired
    DaoTest daoTest;

    public void addUser(int id, String name) {
        daoTest.addUser(id,name);
    }

    public List<User> getUserList() {
        return daoTest.getUserList();
    }
}
