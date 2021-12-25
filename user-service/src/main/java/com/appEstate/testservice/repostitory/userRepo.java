package com.appEstate.testservice.repostitory;

import com.appEstate.testservice.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface userRepo extends JpaRepository<user,Integer> {

    /*flat findFlatByid(Integer flatId);*/



}
