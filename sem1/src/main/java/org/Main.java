package org;
//класс Engine содержит такую характеристику как «размер педалей» и имеет ассоциацию, реализованную в виде композиции с классом Car.
//класс Car, помимо включенного в него класса Engine, имеет порядковый номер произведенного автомобиля;
//класс Customer содержит ссылку на класс Car (между классами ассоциация в виде агрегации), а также ФИО;
//класс FactoryAF содержит коллекцию объектов Customer (между классами ассоциация в виде агрегации) и коллекцию объектов Car (связь в виде композиции). В данном классе реализовать метод SaleCar(), который должен «пробежаться» по всем клиентам в очереди на покупку и по возможности (при наличии) вручить каждому педальный автомобиль. При этом «врученный» автомобиль удаляется из коллекции автомобилей предприятия автотранспортного факультета.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();

        cars.add(new Car(1, 230));
        cars.add(new Car(2, 10));
        cars.add(new Car(3, 3));
        cars.add(new Car(4, 87));

        customers.add(new Customer("LOLOV"));
        customers.add(new Customer("KEKOV"));
        customers.add(new Customer("CHEBUREKOV"));

        FactoryAF factory = new FactoryAF(customers);

        factory.setCars(cars);

        factory.sellCars();
    }
}

