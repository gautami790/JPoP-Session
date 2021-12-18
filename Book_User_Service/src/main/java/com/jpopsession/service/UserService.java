package com.jpopsession.service;

import com.jpopsession.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jpopsession.model.User;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(int id){
        return userRepository.findOne(id);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user){
       User olduser = userRepository.findOne(user.getId());
       olduser.setName(user.getName());
       olduser.setAddress(user.getAddress() );
       userRepository.save(olduser);
       return olduser;
    }

    public String deleteUserById(int id){
        userRepository.delete(id);
        return "User got deleted";
    }
}

