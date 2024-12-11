package com.example.repository;

import com.example.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public List<User> getAllUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User", User.class).list();
    }

    @SuppressWarnings("deprecation")
    public void saveUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    public User getUserById(int id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @SuppressWarnings("deprecation")
    public void deleteUser(int id) {
        User user = getUserById(id);
        sessionFactory.getCurrentSession().delete(user);
    }
}
