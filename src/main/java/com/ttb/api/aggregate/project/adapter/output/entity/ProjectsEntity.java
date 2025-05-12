package com.ttb.api.aggregate.project.adapter.output.entity;

import com.ttb.api.aggregate.employee.adapter.output.entity.DepartmentEntity;
import com.ttb.api.aggregate.employee.adapter.output.entity.DutyEntity;
import com.ttb.api.aggregate.employee.adapter.output.entity.EmployeesEntity;
import com.ttb.api.aggregate.employee.adapter.output.entity.PositionEntity;
import com.ttb.api.common.domain.BaseJpaEntity;
import io.hypersistence.utils.hibernate.id.Tsid;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "projects")
public class ProjectsEntity extends BaseJpaEntity {
    @Id
    @Tsid
    @Comment("프로젝트 ID")
    @Column(columnDefinition = "char(13)")
    private String id;

    @Column(nullable = false, length = 100)
    @Comment("프로젝트명")
    private String title;

    @Column(columnDefinition = "MEDIUMTEXT")
    @Comment("프로젝트 상세")
    private String description;

     @OneToMany
     @Comment("권한 인원")
     private List<EmployeesEntity> permittedEmployees;

}
