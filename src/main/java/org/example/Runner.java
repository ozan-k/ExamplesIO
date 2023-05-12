package org.example;

public class Runner extends Athlete {
    String shoes;

    public Runner() {
        super();
        shoes = null;
    }

    public Runner(String id, String name, int age, boolean injured, String shoes) {
        super(id, name, age, injured);
        this.shoes = shoes;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    @Override
    public String toString() {
        return "Runner {" +
                id +
                ", " + name +
                ", " + age +
                ", " + injured +
                ", " + shoes +
                "}";
    }

}