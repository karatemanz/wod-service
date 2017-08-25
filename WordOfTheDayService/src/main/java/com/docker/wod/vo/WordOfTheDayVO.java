package com.docker.wod.vo;

import java.sql.Date;

public class WordOfTheDayVO {

    private String today;
    private Date todaysDate;
    private String wordOfDay;
    private String owner;
    private Date dateAdded;

    public String getToday() {
        return this.today;
    }

    public void setToday(final String today) {
        this.today = today;
    }

    public Date getTodaysDate() {
        return this.todaysDate;
    }

    public void setTodaysDate(final Date todaysDate) {
        this.todaysDate = todaysDate;
    }

    public String getWordOfDay() {
        return this.wordOfDay;
    }

    public void setWordOfDay(final String wordOfDay) {
        this.wordOfDay = wordOfDay;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(final String owner) {
        this.owner = owner;
    }

    public Date getDateAdded() {
        return this.dateAdded;
    }

    public void setDateAdded(final Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
