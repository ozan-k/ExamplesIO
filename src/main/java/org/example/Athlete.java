package org.example;

public abstract class Athlete {
    String id;
    String name;
    int age;
    boolean injured;

    public Athlete() {
        id = null;
        name = null;
        age = 0;
        injured = false;
    }

    public Athlete(String id, String name, int age, boolean injured) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.injured = injured;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isInjured() {
        return injured;
    }

    public void setInjured(boolean injured) {
        this.injured = injured;
    }
}
