package com.appEstate.testservice.repostitory;

import com.appEstate.testservice.entity.flat;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface   flatRepo extends JpaRepository<flat,Integer> {

    /*flat findFlatByid(Integer flatId);*/



}
