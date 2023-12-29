package com.example.gameloft.repository;

import com.example.gameloft.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProfileRepository extends MongoRepository<Profile, String> {

    @Query(value = "{name:'?0'}")
    Profile findItemByName(String name);

    @Query(value = "{category:'?0'}", fields = "{'name' : 1, 'quantity: 1'}")
    List<Profile> findAll(String category);

    public long count();
}
