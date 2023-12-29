package com.example.gameloft.model;

import java.util.List;

public class Has {
    private List<String> country;
    private List<String> items;

    public Has(List<String> country, List<String> items) {
        this.country = country;
        this.items = items;
    }

    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
