package com.docker.wod.util;

import java.sql.Date;

import org.springframework.stereotype.Component;

import com.docker.wod.model.WeeksWords;
import com.docker.wod.vo.WordOfTheDayVO;

@Component
public class WordOfTheDayConverter {

    public WordOfTheDayVO convertWordOfDayToVO(final WeeksWords wordOfDay) {
        final WordOfTheDayVO wordOfDayVO = new WordOfTheDayVO();
        wordOfDayVO.setToday(wordOfDay.getDay().getName());
        wordOfDayVO.setTodaysDate(new Date(new java.util.Date().getTime()));
        wordOfDayVO.setWordOfDay(wordOfDay.getWord().getName());
        wordOfDayVO.setOwner(wordOfDay.getWord().getWordOwner());
        wordOfDayVO.setDateAdded(wordOfDay.getWord().getDateAdded());

        return wordOfDayVO;
    }

}
