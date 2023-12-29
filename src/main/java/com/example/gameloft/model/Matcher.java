package com.example.gameloft.model;

public class Matcher {
    private Level level;
    private Has has;
    private NHas nhas;

    public Matcher(Level level, Has has, NHas nhas) {
        this.level = level;
        this.has = has;
        this.nhas = nhas;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Has getHas() {
        return has;
    }

    public void setHas(Has has) {
        this.has = has;
    }

    public NHas getNhas() {
        return nhas;
    }

    public void setNhas(NHas nhas) {
        this.nhas = nhas;
    }
}
