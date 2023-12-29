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

    public Campaign createCampaign() {
        Level level = new Level(1, 3);
        List<String> country = new ArrayList<>();
        country.add("US");
        country.add("RO");
        country.add("CA");
        List<String> items = new ArrayList<>();
        items.add("item_1");

        Has has = new Has(country, items);

        List<String> nitems = new ArrayList<>();
        nitems.add("items_4");

        NHas nhas = new NHas(nitems);
        Matcher matcher = new Matcher(level, has, nhas);

        return new Campaign("mygame", "mycampaign", 10.5, matcher,
                "2022-01-25 00:00:00Z", "2022-02-25 00:00:00Z", true, "2021-07-13 11:46:58Z");
    }


}
