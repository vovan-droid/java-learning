package org.vova.drawing;

public class Dot {
    private int amountOfSpacesInitial;
    private int amountOfSpacesStep;


    public Dot(int amountOfSpacesInitial, int amountOfSpacesStep) {
        this.amountOfSpacesInitial = amountOfSpacesInitial;
        this.amountOfSpacesStep = amountOfSpacesStep;
    }

    public int getAmountOfSpacesInitial() {
        return amountOfSpacesInitial;
    }

    public void setAmountOfSpacesInitial(int amountOfSpacesInitial) {
        this.amountOfSpacesInitial = amountOfSpacesInitial;
    }

    public int getAmountOfSpacesStep() {
        return amountOfSpacesStep;
    }

    public void setAmountOfSpacesStep(int amountOfSpacesStep) {
        this.amountOfSpacesStep = amountOfSpacesStep;
    }
}
