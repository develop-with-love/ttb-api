package com.ttb.api.aggregate.employee.application.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ttb.api.aggregate.employee.adapter.output.entity.EmployeesEntity;
import com.ttb.api.aggregate.employee.adapter.output.repository.EmployeesRepository;
import com.ttb.api.aggregate.employee.application.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private EmployeesRepository employeesRepository;

    @Override
    public EmployeesEntity findByEmail(String email) {
        EmployeesEntity employeesEntity = employeesRepository.findByEmail(email);
        if(employeesEntity == null){
            throw new UsernameNotFoundException("User not found");
        }
        return employeesEntity;
    }

}
