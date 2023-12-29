package com.example.gameloft.profileservice;

import com.example.gameloft.model.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProfileService {

    public ProfileService() {

    }

    public Profile createProfile(String playerId, String country, Map<String, Integer> inventory, int level) {
        Device device = new Device(1, "apple iphone 11", "vodafone", "123");

        Map<String, String> clan = new HashMap<>();
        clan.put("id", "123456");
        clan.put("name", "Hello world clan");

        return new Profile(playerId, "apple-credential",
                "2021-01-10 13:37:17Z", "2021-01-23 13:37:17Z", "2021-01-23 13:37:17Z",
                400, 0, 5, "2021-01-22 13:37:17Z", Collections.singletonList(device),
                level, 1000, 144, country, "fr", "2000-01-10 13:37:17Z","male",
                inventory, clan, "mycustom");
    }




}
