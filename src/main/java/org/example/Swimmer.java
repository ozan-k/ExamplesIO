package org.example;

public class Swimmer extends Athlete {
    String modality;

    public Swimmer() {
        super();
        modality = null;
    }

    public Swimmer(String id, String name, int age, boolean injured, String modality) {
        super(id, name, age, injured);
        this.modality = modality;
    }

    public String getModality() {
        return modality;
    }

    public void setModality(String modality) {
        this.modality = modality;
    }

    @Override
    public String toString() {
        return "Swimmer {" +
                id +
                ", " + name +
                ", " + age +
                ", " + injured +
                ", " + modality +
                "}";
    }
}