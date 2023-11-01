package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundMeowIsTrue() {
        Cat cat = new Cat(new Feline());
        String expectedString = "Мяу";
        assertEquals(expectedString, cat.getSound());
    }

    @Test
    public void getFoodListOfFoodIsTrue() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedListOfFood);
        assertEquals(expectedListOfFood, cat.getFood());
    }

}
