package com.TABD3.TABD3.repository;

import com.TABD3.TABD3.model.Show;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends MongoRepository<Show, String> {
    List<Show> findByShowId(String id);


}
