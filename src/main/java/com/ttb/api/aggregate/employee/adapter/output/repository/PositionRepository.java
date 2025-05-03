package com.ttb.api.aggregate.employee.adapter.output.repository;

import com.ttb.api.aggregate.employee.adapter.output.entity.PositionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<PositionEntity, String> {
} 