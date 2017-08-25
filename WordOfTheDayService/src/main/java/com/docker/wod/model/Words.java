package com.docker.wod.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "WORDS", schema = "WOD")
public class Words implements Serializable {

    private static final long serialVersionUID = 1571986671099690040L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "WORD_ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "WORD_OWNER", nullable = false)
    private String owner;

    @Column(name = "DATE_ADDED", nullable = false)
    private Date dateAdded;

    @Column(name = "WORD_NAME", nullable = false)
    private String name;

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getWordOwner() {
        return this.owner;
    }

    public void setWordOwner(final String wordOwner) {
        this.owner = wordOwner;
    }

    public Date getDateAdded() {
        return this.dateAdded;
    }

    public void setDateAdded(final Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
