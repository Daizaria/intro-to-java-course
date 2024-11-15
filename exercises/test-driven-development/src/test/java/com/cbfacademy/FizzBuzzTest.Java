package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "LeapYearTest")

public LeapYearTest {

//    for multiples of 3, it returns “Fizz” instead of the number
//    for multiples of 5, it returns “Buzz” instead of the number
//    for multiples of 15, it returns “FizzBuzz” instead of the number
//    the string representation of the number otherwise - make fizzbuzz class

    @Test
    @DisplayName("the method a string")
    public void returnsAString() {
        final LeapYear leapyear = new App();

        assertThat(app, is(notNullValue()));
    }
}