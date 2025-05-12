package com.ttb.api.aggregate.project.adapter.output.entity;

import com.ttb.api.aggregate.employee.adapter.output.entity.EmployeesEntity;
import com.ttb.api.common.domain.BaseJpaEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "task")
public class TaskEntity extends BaseJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long seq;

    @Column(nullable = false, length = 100)
    @Comment("작업명")
    private String title;

    @Column(nullable = false, columnDefinition = "MEDIUMTEXT")
    @Comment("작업 상세")
    private String contents;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @Column(nullable = false)
    @Comment("목표일")
    private LocalDateTime dueDate;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
    @Column(nullable = false)
    @Comment("시작일")
    private LocalDateTime startDate;

     @OneToMany
     @Comment("권한 인원")
     private List<EmployeesEntity> permittedEmployees;
}
