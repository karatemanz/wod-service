package com.docker.wod.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.docker.wod.model.Days;

@Repository
public interface DaysRepository extends CrudRepository<Days, String> {

    public Days findById(Long id);

    public List<Days> findAll();

}
