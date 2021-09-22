package org.example.MavenTest;

import org.example.MavenTest.House;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий год: ");
        int currentYear = scanner.nextInt();

        House house = new House();
        house.set(10,1985,"Первый дом");
        house.printAll();

        int countYear = house.getCountYear(currentYear);
        System.out.println("С постройки прошло " + countYear + " лет");

    }
}