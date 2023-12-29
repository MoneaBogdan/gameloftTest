package com.example.gameloft.campaignservice;

import com.example.gameloft.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampaignService {

    public CampaignService() {

    }

    public Campaign getCampaign() {
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
