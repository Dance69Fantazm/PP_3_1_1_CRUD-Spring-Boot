package com.akhmetov.pp_3_1_1_crudspringboot.dao;

import com.akhmetov.pp_3_1_1_crudspringboot.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(long id);
}
