package com.ttb.api.aggregate.employee.adapter.output.repository;

import com.ttb.api.aggregate.employee.adapter.output.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, String> {
} 