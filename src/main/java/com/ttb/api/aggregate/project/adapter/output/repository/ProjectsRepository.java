package com.ttb.api.aggregate.project.adapter.output.repository;

import com.ttb.api.aggregate.project.adapter.output.entity.ProjectsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectsRepository extends JpaRepository<ProjectsEntity, String> {
} 