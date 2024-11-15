package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName(value = "Basic Test Suite")
public class LeapYearTest {
//
//    years divisible by 400 are leap years
//    years divisible by 100 but not by 400 are not leap years
//    years divisible by 4 but not by 100 are leap years
//    years not divisible by 4 are not leap years

    @Test
    @DisplayName("creates the app")
    public void createsAnApp() {
        final App app = new App();

        assertThat(app, is(notNullValue()));
    }
}