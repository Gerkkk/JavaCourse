package org;

public class Customer {
    public String FIO;
    public Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public Customer(String FIO, Car car) {
        this.FIO = FIO;
        this.car = car;
    }

    public Customer(String FIO) {
        this.FIO = FIO;
    }
}