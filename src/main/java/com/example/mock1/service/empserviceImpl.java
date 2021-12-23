package com.example.mock1.service;

import com.example.mock1.entity.employee;
import com.example.mock1.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empserviceImpl implements empservice{

    @Autowired
    Repository repo;

    @Override
    public void add(employee emp) {
        repo.save(emp);
    }

    @Override
    public employee get(int id) {
        List<employee> l1;
        l1=repo.findAll();

        for(int i=0;i<l1.size();i++)
        {
            if(l1.get(i).getId()==id)
                return l1.get(i);
        }
        return null;

    }
}
