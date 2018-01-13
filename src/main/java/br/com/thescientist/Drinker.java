package br.com.thescientist;

public class Drinker {

    private int id;
    private String name;
    private long coffeeCounter;

    public Drinker(int id, String name) {
        this.id = id;
        this.name = name;
        this.coffeeCounter = 0;
    }

    public Drinker(int id, String name, long coffeeCounter) {
        this.id = id;
        this.name = name;
        this.coffeeCounter = coffeeCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCoffeeCounter() {
        return coffeeCounter;
    }

    public void setCoffeeCounter(long coffeeCounter) {
        this.coffeeCounter = coffeeCounter;
    }
}
