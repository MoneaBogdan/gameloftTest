package com.example.gameloft;

import com.example.gameloft.model.Profile;
import com.example.gameloft.profileservice.ProfileService;
import com.example.gameloft.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@EnableMongoRepositories
public class ProfileMatcherApplication implements CommandLineRunner {

	@Autowired
	ProfileRepository profileRepository;
	@Autowired
	ProfileService profileService;

	public static void main(String[] args) {
		SpringApplication.run(ProfileMatcherApplication.class, args);
	}

	@Override
	public void run(String... args) {
		List<Profile> profileList = new ArrayList<>();

		profileRepository.deleteAll();

		Map<String, Integer> inventory1 = new HashMap<>();
        inventory1.put("cash", 123);
        inventory1.put("coins", 123);
        inventory1.put("item_1", 1);
        inventory1.put("item_34", 3);
        inventory1.put("item_55", 2);

		Map<String, Integer> inventory2 = new HashMap<>();
		inventory2.put("cash", 456);
		inventory2.put("coins", 567);

		Map<String, Integer> inventory3 = new HashMap<>();
		inventory3.put("cash", 456);
		inventory3.put("coins", 567);
		inventory3.put("item_77", 55);

		profileList.add(profileService.createProfile("97983be2-98b7-11e7-90cf-082e5f28d836", "CA",
				inventory1, 3));
		profileList.add(profileService.createProfile("97983be2-98b7-11e7-90cf-082e5f28d000", "HU",
				inventory2, 5));
		profileList.add(profileService.createProfile("97983be2-98b7-11e7-90cf-082e5f28d001", "HU",
				inventory3, 7));
		profileRepository.saveAll(profileList);
	}
}
