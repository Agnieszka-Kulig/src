package com.company;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("cat");
        cat.takeForAWalk();
        cat.feed(0.5);
        cat.feed(0.3);
        cat.takeForAWalk();
        cat.feed(0.3);

        while (cat.isAlive) {
            cat.takeForAWalk();
        }

        cat.feed(0.5);

        Car fiat = new Car(2003, "Fiat", "Bravo", "gray", 10000.0);
        System.out.println(fiat.producer + " " + fiat.model + " " + fiat.yearOfProduction);
    }
}
