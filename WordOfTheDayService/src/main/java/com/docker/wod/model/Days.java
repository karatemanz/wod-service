package com.docker.wod.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DAYS", schema = "WOD")
public class Days implements Serializable {

    private static final long serialVersionUID = 7929824911360413731L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "DAY_ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "DAY_CODE", nullable = false)
    private String code;

    @Column(name = "DAY_SHORT_NAME", nullable = false)
    private String shortName;

    @Column(name = "DAY_NAME", nullable = false)
    private String name;

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getDayCode() {
        return this.code;
    }

    public void setDayCode(final String dayCode) {
        this.code = dayCode;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(final String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
