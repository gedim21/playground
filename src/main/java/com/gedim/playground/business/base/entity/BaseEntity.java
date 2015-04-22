package com.gedim.playground.business.base.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Entity implementation class for Entity: BaseEntity
 */

@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -7368158935860299361L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public BaseEntity() {
        super();
    }

    public final Long getId() {
        return this.id;
    }

    public final void setId(Long id) {
        this.id = id;
    }

}
