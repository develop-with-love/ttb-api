package com.ttb.api.aggregate.employee.application.service;

import com.ttb.api.aggregate.employee.adapter.output.entity.EmployeesEntity;

public interface AccountService {

    public EmployeesEntity findByEmail(String email);
}
