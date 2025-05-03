package com.ttb.api.aggregate.employee.adapter.output.repository;

import com.ttb.api.aggregate.employee.adapter.output.entity.EmployeesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesEntity, String> {
} 