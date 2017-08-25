package com.docker.wod.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.docker.wod.model.Days;
import com.docker.wod.model.WeeksWords;
import com.docker.wod.model.Words;

@Repository
public interface WeeksWordsRepository extends CrudRepository<Days, Words> {

    @Query("SELECT w FROM WeeksWords w WHERE w.day.name = :dayName")
    public WeeksWords findWeeksWordsByDayName(@Param("dayName") String dayName);

}
