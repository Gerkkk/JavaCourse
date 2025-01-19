package org;

import java.util.ArrayList;

public class FactoryAF {
    public ArrayList<Car> cars;
    public ArrayList<Customer> customers;

    public FactoryAF(ArrayList<Customer> customers) {
        this.customers = customers;
        cars = new ArrayList<>();
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void sellCars() {
        for (int i = 0; i < customers.size(); i++) {
            if (cars.size() == 0) {
                System.out.println("Всем автомобилей не хватило");
            }

            if (customers.get(i).getCar() == null) {
                customers.get(i).setCar(cars.get(0));
                System.out.println("Покупатель " + customers.get(i).getFIO() + " получил автомобиль с номером " + customers.get(i).getCar().getNumber());
                cars.remove(customers.get(i).getCar());

            }
        }

        if (cars.size() > 0) {
            System.out.println("Осталось автомобилей: " + cars.size() + ". Очистка склада...");
            cars.clear();
        }
    }
}