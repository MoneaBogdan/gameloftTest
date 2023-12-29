package com.example.gameloft.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Document("profile")
public class Profile {

    @Id
    private String player_id;
    private String credential;
    private String created;
    private String modified;
    private String last_session;
    private int total_spent;
    private int total_refund;
    private int total_transactions;
    private String last_purchase;
    private List<Campaign> active_campaigns;
    private List<Device> devices;
    private int level;
    private int xp;
    private int total_playtime;
    private String country;
    private String language;
    private String birthdate;
    private String gender;
    private Map inventory;
    private Map clan;

    private String customfield;

    public Profile(String player_id, String credential, String created, String modified, String last_session,
                   int total_spent, int total_refund, int total_transactions, String last_purchase,
                   List<Device> devices, int level, int xp, int total_playtime, String country, String language,
                   String birthdate, String gender, Map inventory, Map clan, String customfield) {
        this.player_id = player_id;
        this.credential = credential;
        this.created = created;
        this.modified = modified;
        this.last_session = last_session;
        this.total_spent = total_spent;
        this.total_refund = total_refund;
        this.total_transactions = total_transactions;
        this.last_purchase = last_purchase;
        this.active_campaigns = Collections.emptyList();
        this.devices = devices;
        this.level = level;
        this.xp = xp;
        this.total_playtime = total_playtime;
        this.country = country;
        this.language = language;
        this.birthdate = birthdate;
        this.gender = gender;
        this.inventory = inventory;
        this.clan = clan;
        this.customfield = customfield;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getLast_session() {
        return last_session;
    }

    public void setLast_session(String last_session) {
        this.last_session = last_session;
    }

    public int getTotal_spent() {
        return total_spent;
    }

    public void setTotal_spent(int total_spent) {
        this.total_spent = total_spent;
    }

    public int getTotal_refund() {
        return total_refund;
    }

    public void setTotal_refund(int total_refund) {
        this.total_refund = total_refund;
    }

    public int getTotal_transactions() {
        return total_transactions;
    }

    public void setTotal_transactions(int total_transactions) {
        this.total_transactions = total_transactions;
    }

    public String getLast_purchase() {
        return last_purchase;
    }

    public void setLast_purchase(String last_purchase) {
        this.last_purchase = last_purchase;
    }

    public List<Campaign> getActive_campaigns() {
        return active_campaigns;
    }

    public void setActive_campaigns(Campaign active_campaigns) {
        this.active_campaigns.add(active_campaigns);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getTotal_playtime() {
        return total_playtime;
    }

    public void setTotal_playtime(int total_playtime) {
        this.total_playtime = total_playtime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Map getInventory() {
        return inventory;
    }

    public void setInventory(Map inventory) {
        this.inventory = inventory;
    }

    public Map getClan() {
        return clan;
    }

    public void setClan(Map clan) {
        this.clan = clan;
    }

    public String getCustomfield() {
        return customfield;
    }

    public void setCustomfield(String customfield) {
        this.customfield = customfield;
    }
}
