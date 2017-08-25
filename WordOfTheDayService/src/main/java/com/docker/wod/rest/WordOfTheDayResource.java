package com.docker.wod.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.docker.wod.model.WeeksWords;
import com.docker.wod.service.WordOfTheDayService;
import com.docker.wod.util.WordOfTheDayConverter;
import com.docker.wod.vo.WordOfTheDayVO;

@RestController
@RequestMapping(value = "/rest/wordofday")
public class WordOfTheDayResource {

    private static Logger logger = LoggerFactory.getLogger(WordOfTheDayResource.class);

    @Autowired
    WordOfTheDayService wordOfTheDayService;

    @Autowired
    WordOfTheDayConverter wordOfTheDayConverter;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping(value = "/wotd", method = RequestMethod.GET)
    public WordOfTheDayVO getWordOfTheDay() {

        final WeeksWords wordOfDay = this.wordOfTheDayService.getWordOfTheDay();
        return this.wordOfTheDayConverter.convertWordOfDayToVO(wordOfDay);
    }

    @RequestMapping(value = "/wotd", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateWordOfTheDay(@Param("id") final Long wordId, @Param("word") final String updateWord) {

    }

    @RequestMapping(value = "/wotd", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addWordForToday(@Param("word") final String newWord) {

    }
}
