package com.docker.wod.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.wod.intrf.WordOfTheDayServiceInterface;
import com.docker.wod.model.WeeksWords;
import com.docker.wod.repository.WeeksWordsRepository;

@Service
public class WordOfTheDayService implements WordOfTheDayServiceInterface {

    @Autowired
    WeeksWordsRepository weeksWordsReferenceRepository;

    public WeeksWords getWordOfTheDay() {
        final Calendar c = Calendar.getInstance();
        final SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE");
        final String dayOfWeek = dateFormat.format(c.getTime());

        return this.weeksWordsReferenceRepository.findWeeksWordsByDayName(dayOfWeek.trim());
    }

}
