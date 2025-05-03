package com.ttb.api.common.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.Comment;

@Getter
@MappedSuperclass
public class BaseJpaEntity extends Timestamped{

    @Column
    @Comment("삭제여부")
    private final boolean isDeleted = false;

    @Column(columnDefinition = "char(13)")
    @Comment("생성자")
    private String creatorId;

    @Column(columnDefinition = "char(13)")
    @Comment("수정자")
    private String updaterId;
}
