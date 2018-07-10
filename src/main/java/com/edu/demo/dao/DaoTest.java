package com.edu.demo.dao;

import com.edu.demo.model.dto.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * User: ztwu2
 * Date: 2018/7/10
 * Time: 11:07
 * Description
 */
@Repository
public interface DaoTest {

    void addUser(int id, String name);

    List<User> getUserList();
}
