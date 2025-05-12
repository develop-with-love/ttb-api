package com.ttb.api.aggregate.employee.application.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ttb.api.aggregate.employee.adapter.output.entity.EmployeesEntity;
import com.ttb.api.aggregate.employee.application.service.AccountService;

public class UserDetailServiceImpl implements UserDetailsService{

    @Autowired
    private AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        EmployeesEntity employeesEntity = accountService.findByEmail(username);
        if(employeesEntity == null){
            throw new UsernameNotFoundException("User not found");
        }
        return User.withUsername(employeesEntity.getEmail())
        .password(employeesEntity.getPassword())
        .roles(getRoles(employeesEntity))
        .build();
    }

    private String[] getRoles(EmployeesEntity employeesEntity){
        if(employeesEntity.getRole() == null){
            return new String[]{"USER"};
        }
        return new String[]{employeesEntity.getRole().name()};
    }

}
