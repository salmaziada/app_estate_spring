package com.appEstate.testservice.service;

import com.appEstate.testservice.entity.flat;
import com.appEstate.testservice.repostitory.flatRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class flatService {
  @Autowired
  flatRepo flatRepo;
    public List getAll() {
        return flatRepo.findAll();

    }

   public flat saveFlat(flat flat) {
        return flatRepo.save(flat);
    }

   /* public flat findFlat(Integer flatId) {

        return flatRepo.findFlatByid(flatId);
    }*/
}
