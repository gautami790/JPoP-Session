package com.jpopsession.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpopsession.model.User;

public interface UserRepository extends JpaRepository<User
        , Integer> {

}