package com.docker.wod.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordOfTheDayResource {

    private static Logger logger = LoggerFactory.getLogger(WordOfTheDayResource.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping(value = "/wotd", method = RequestMethod.GET)
    public String getWordOfTheDay() {
        return "Word of the Day:";
    }

}
