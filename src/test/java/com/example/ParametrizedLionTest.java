package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static junit.framework.TestCase.assertEquals;
@RunWith(Parameterized.class)
public class ParametrizedLionTest {
    private String lionSex;
    private Feline feline;
    private boolean hasManeExpected;
    public ParametrizedLionTest(String lionSex,  boolean hasManeExpected) {
        this.lionSex = lionSex;
        this.hasManeExpected = hasManeExpected;
    }

    @Parameterized.Parameters(name = "Пол животного: {0}, значение: {1}")
    public static Object[][] getDataForm() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        boolean hasManeActual = lion.doesHaveMane();
        assertEquals(hasManeExpected, hasManeActual);
    }
}

