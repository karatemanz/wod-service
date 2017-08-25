package com.docker.wod.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.docker.wod.model.Words;

@Repository
public interface WordsRepository extends CrudRepository<Words, String> {

    public Words findById(Long id);

    public List<Words> findByOwner(String owner);

    public List<Words> findByDateAdded(Date added);

}
