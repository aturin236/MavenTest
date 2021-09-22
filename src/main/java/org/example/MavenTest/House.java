package org.example.MavenTest;

public class House {
    private int countFloor, yearBuild;
    private String name;

    public void set(int countFloor, int yearBuild, String name) {
        this.countFloor = countFloor;
        this.yearBuild = yearBuild;
        this.name = name;
    }

    public void  printAll() {
        System.out.println("Дом " + this.name + " построен в " + this.yearBuild + " году");
    }

    public int getCountYear(int todayYear) {
        int countYear = 0;
        if (todayYear > yearBuild) {
            countYear = todayYear - yearBuild;
        }

        return countYear;
    }
}