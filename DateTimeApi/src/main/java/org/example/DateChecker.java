package org.example;

import java.time.LocalDate;
import java.time.Period;

public class DateChecker {
    public static int calculateYears(Employee e) {
        return Period.between(e.getDoj(), LocalDate.now()).getYears();
    }

    public static boolean checkValidity(LocalDate dob, LocalDate doj) {
        return dob.isBefore(doj);
    }
}
