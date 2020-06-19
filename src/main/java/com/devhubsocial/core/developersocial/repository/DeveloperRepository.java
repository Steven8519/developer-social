package com.devhubsocial.core.developersocial.repository;

import com.devhubsocial.core.developersocial.entities.Developer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DeveloperRepository extends ReactiveMongoRepository<Developer, String> {

}
