package com.ttb.api.aggregate.employee.adapter.output.entity;

import com.ttb.api.common.domain.BaseJpaEntity;
import io.hypersistence.utils.hibernate.id.Tsid;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "employees")
public class EmployeesEntity extends BaseJpaEntity {
    @Id
    @Tsid
    @Comment("고유 ID")
    @Column(columnDefinition = "char(13)")
    private String id;

    @Column(unique = true)
    @Comment("이메일")
    private String email;

    @Column(nullable = false, columnDefinition = "char(60)")
    @Comment("비밀번호")
    private String password;

    @Column(nullable = false, length = 15)
    @Comment("이름")
    private String name;

    @Column
    @Comment("전화번호")
    private String phoneNumber;

    @Column
    @Comment("내선번호")
    private String extensionNumber;

    @Column
    @Comment("생성자")
    private boolean isLeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @Comment("부서")
    private DepartmentEntity department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @Comment("직책")
    private DutyEntity duty;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @Comment("직급")
    private PositionEntity position;

}
