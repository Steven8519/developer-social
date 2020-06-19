package com.devhubsocial.core.developersocial.repository;

import com.devhubsocial.core.developersocial.entities.Developer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.Arrays;
import java.util.List;

@DataMongoTest
@RunWith(SpringRunner.class)
public class DeveloperRepositoryTest {

    List<Developer> developerList = Arrays.asList(new Developer("1", "Michael", "Thomas", "Python Developer"),
            new Developer("2", "Sam", "Smith", "Java Developer" ),
            new Developer("3", "Frank", "Robinson", "React Developer" ));

    @Autowired
    DeveloperRepository developerRepository;

    @Before
    public void setUp() {
        developerRepository.deleteAll()
                .thenMany(Flux.fromIterable(developerList))
                .flatMap(developerRepository::save)
                .doOnNext((developer -> {
                    System.out.println("Developer inserted is: " + developer);
                }))
                .blockLast();
    }

    @Test
    public void getAllDevelopersTest() {
        StepVerifier.create(developerRepository.findAll())
                .expectSubscription()
                .expectNextCount(3)
                .verifyComplete();
    }
}
