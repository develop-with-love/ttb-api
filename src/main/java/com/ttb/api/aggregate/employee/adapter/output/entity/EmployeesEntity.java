package com.ttb.api.aggregate.employee.adapter.output.entity;

import com.ttb.api.common.domain.BaseJpaEntity;
import io.hypersistence.utils.hibernate.id.Tsid;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
public class EmployeesEntity extends BaseJpaEntity {
    @Id
    @Tsid
    @Comment("고유 ID")
    @Column(columnDefinition = "CHAR(13)")
    private String id;

    @Column(updatable = true)
    private String email;


}
