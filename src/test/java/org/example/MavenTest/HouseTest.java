package org.example.MavenTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class HouseTest {

    @Test
    void getCountYear() {
        House house = new House();
        house.set(10,1985,"Первый дом");

        int countYear = house.getCountYear(2021);
        int result = 35;
        assertEquals(result, countYear);
    }
}