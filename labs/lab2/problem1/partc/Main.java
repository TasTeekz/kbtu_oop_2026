package labs.lab2.problem1.partc;

import java.util.HashSet;
import java.util.Set;

import labs.lab2.problem1.partc.model.*;

public class Main {
    public static void main(String[] args) {

        Set<EnergyDrink> drinks = new HashSet<>();

        EnergyDrink d1 = new EnergyDrink("Monster", 500, 160, 7);
        EnergyDrink d2 = new EnergyDrink("Monster", 500, 160, 7);
        EnergyDrink d3 = new EnergyDrink("RedBull", 250, 80, 5);

        drinks.add(d1);
        drinks.add(d2);
        drinks.add(d3);

        System.out.println("total drinks in set: " + drinks.size());

        for (EnergyDrink d : drinks) {
            System.out.println(d);
        }
    }
}