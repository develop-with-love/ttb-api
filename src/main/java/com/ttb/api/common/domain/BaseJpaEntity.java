package com.ttb.api.common.domain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@Getter
@MappedSuperclass
public class BaseJpaEntity extends Timestamped{

    @Column(name = "삭제여부")
    private final boolean isDeleted = false;

    @Column(name = "생성자", columnDefinition = "CHAR(10)")
    private String creatorId;

    @Column(name = "수정자", columnDefinition = "CHAR(10)")
    private String updaterId;
}
