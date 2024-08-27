package com.bluered.pokemon.models;

public class Pokemon {
    
    private String name;
    private String number;
    private String type1;
    private String type2;
    private Stats stats;
    private Attack attack;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getType1() {
        return type1;
    }
    public void setType1(String type1) {
        this.type1 = type1;
    }
    public String getType2() {
        return type2;
    }
    public void setType2(String type2) {
        this.type2 = type2;
    }
    public Stats getStats() {
        return stats;
    }
    public void setStats(Stats stats) {
        this.stats = stats;
    }
    public Attack getAttack() {
        return attack;
    }
    public void setAttack(Attack attack) {
        this.attack = attack;
    }
}
