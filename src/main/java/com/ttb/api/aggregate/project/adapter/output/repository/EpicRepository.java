package com.ttb.api.aggregate.project.adapter.output.repository;

import com.ttb.api.aggregate.project.adapter.output.entity.EpicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpicRepository extends JpaRepository<EpicEntity, String> {
} 