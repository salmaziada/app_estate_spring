package com.appEstate.testservice.service;

import com.appEstate.testservice.entity.user;
import com.appEstate.testservice.repostitory.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class userService {
  @Autowired
  userRepo userRepo;
    public List getAll() {
        return userRepo.findAll();

    }

   public user saveUser(user user) {
        return userRepo.save(user);
    }

   /* public flat findFlat(Integer flatId) {

        return flatRepo.findFlatByid(flatId);
    }*/
}
