package org;

public class Car {
    public Engine engine;
    public int number;

    public Car(int number, int pedSize) {

        engine = new Engine(pedSize);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}