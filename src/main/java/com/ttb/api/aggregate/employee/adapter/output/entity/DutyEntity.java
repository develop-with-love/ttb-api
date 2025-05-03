package com.ttb.api.aggregate.employee.adapter.output.entity;

import com.ttb.api.common.domain.BaseJpaEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "duty")
public class DutyEntity extends BaseJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long seq;

    @Column(nullable = false, length = 25)
    @Comment("직책명")
    private String name;

    @Column
    @Comment("순서")
    private int sort_order;

}
