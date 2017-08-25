package com.docker.wod.vo;

import java.util.List;

import com.docker.wod.model.WeeksWords;

public class WeeksWordsVO {

    private List<WeeksWords> wordsOfTheWeek;

    public List<WeeksWords> getWordsOfTheWeek() {
        return this.wordsOfTheWeek;
    }

    public void setWordsOfTheWeek(final List<WeeksWords> wordsOfTheWeek) {
        this.wordsOfTheWeek = wordsOfTheWeek;
    }

}
