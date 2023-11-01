package com.example;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class FelineTest {

    @Test
    public void getFamilyFelineFamilyIsTrue() {
        String expectedFelineFamilyName = "Кошачьи";
        MatcherAssert.assertThat("Не кошачьи",
                new Feline().getFamily(),
                equalTo(expectedFelineFamilyName)
        );
    }

    @Test
    public void getKittensInputCountIsTrue() {
        int expectedCount = 5;
        MatcherAssert.assertThat("Некорректное количество котят",
                new Feline().getKittens(expectedCount),
                equalTo(expectedCount)
        );
    }

    @Test
    public void getKittensDefaultIsTrue() {
        int expectedCount = 1;
        MatcherAssert.assertThat("Некорректное количество котят",
                new Feline().getKittens(),
                equalTo(expectedCount)
        );
    }

    @Test
    public void eatMeatIsTrue() throws Exception {
        Feline feline = new Feline();

        MatcherAssert.assertThat("Некорректный список еды",
                feline.eatMeat(),
                equalTo(feline.getFood("Хищник"))
        );
    }

}
