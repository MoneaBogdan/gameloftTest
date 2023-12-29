package com.example.gameloft.model;

public class Campaign {
    private String game;
    private String name;
    private double priority;
    private Matcher matchers;
    private String start_date;
    private String end_date;
    private boolean enabled;
    private String last_updated;

    public Campaign(String game, String name, double priority, Matcher matchers, String start_date, String end_date,
                    boolean enabled, String last_updated) {
        this.game = game;
        this.name = name;
        this.priority = priority;
        this.matchers = matchers;
        this.start_date = start_date;
        this.end_date = end_date;
        this.enabled = enabled;
        this.last_updated = last_updated;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }

    public Matcher getMatchers() {
        return matchers;
    }

    public void setMatchers(Matcher matchers) {
        this.matchers = matchers;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }
}
