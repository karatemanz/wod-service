package com.docker.wod.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WEEKS_WORDS", schema = "WOD")
public class WeeksWords implements Serializable {

    private static final long serialVersionUID = 1055978438572599473L;

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DAY_ID", nullable = false, insertable = false, updatable = true)
    private Days day;

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORD_ID", nullable = false, insertable = false, updatable = true)
    private Words word;

    @Column(name = "LAST_CHANGED", nullable = false)
    private Date lastChanged;

    public Days getDay() {
        return this.day;
    }

    public void setDay(final Days day) {
        this.day = day;
    }

    public Words getWord() {
        return this.word;
    }

    public void setWord(final Words word) {
        this.word = word;
    }

    public Date getLastChanged() {
        return this.lastChanged;
    }

    public void setLastChanged(final Date lastChanged) {
        this.lastChanged = lastChanged;
    }

}
