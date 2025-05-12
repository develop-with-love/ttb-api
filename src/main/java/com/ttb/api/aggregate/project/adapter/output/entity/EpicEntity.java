package com.ttb.api.aggregate.project.adapter.output.entity;

import com.ttb.api.aggregate.employee.adapter.output.entity.EmployeesEntity;
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
@Entity(name = "epic")
public class EpicEntity extends BaseJpaEntity {
    @Id
    @Tsid
    @Comment("에픽 ID")
    @Column(columnDefinition = "char(13)")
    private String id;

    @Column(nullable = false, length = 100)
    @Comment("에픽 제목")
    private String title;

    @Column(columnDefinition = "MEDIUMTEXT")
    @Comment("에픽 상세")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @Comment("상위 프로젝트 ID")
    private ProjectsEntity project;

     @OneToMany
     @Comment("권한 인원")
     List<EmployeesEntity> permittedEmployees;

}
