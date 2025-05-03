package com.ttb.api.aggregate.project.adapter.output.repository;

import com.ttb.api.aggregate.project.adapter.output.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, String> {
} 