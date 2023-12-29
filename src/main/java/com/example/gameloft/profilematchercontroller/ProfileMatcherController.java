package com.example.gameloft.profilematchercontroller;

import com.example.gameloft.campaignservice.CampaignService;
import com.example.gameloft.model.Campaign;
import com.example.gameloft.model.Profile;
import com.example.gameloft.profileservice.ProfileService;
import com.example.gameloft.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileMatcherController {

    @Autowired
    private ProfileRepository profileRepository;
    @Autowired
    private ProfileService profileService;
    @Autowired
    private CampaignService campaignService;

    @GetMapping(path = "/get_clients_config")
    public List<Profile> getClients() {
        return profileRepository.findAll();
    }

    @GetMapping(path = "/get_client_config/{player_id}")
    public Profile getClientById(@PathVariable String player_id) {
        Campaign campaign = campaignService.getCampaign();
        Profile profile = profileRepository.findById(player_id).orElse(null);

        if (profile != null) {
            if (profile.getLevel() >= campaign.getMatchers().getLevel().getMin() &&
                profile.getLevel() <= campaign.getMatchers().getLevel().getMax() &&
                campaign.getMatchers().getHas().getCountry().contains(profile.getCountry()) &&
                profile.getInventory().containsKey(campaign.getMatchers().getHas().getItems().get(0)) &&
                !profile.getInventory().containsKey(campaign.getMatchers().getNhas().getItems().get(0))) {

                System.out.println("We found the right profile for this campaign. Update object in DB and return" +
                        " new profile");
                profile.setActive_campaigns(campaign);
                profileRepository.save(profile);
                return profile;
            }

            System.out.println("There was no match, return current profile");
            return profile;
        }

        System.out.println("No profile found, return null");
        return null;
    }
}