package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class IncomeExpenseServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/IncomeExpenses.csv")
    void NumberOfMonthsForHolidaysFirst(int expected, int income, int expenses, int threshold) {
        IncomeExpenseService service = new IncomeExpenseService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}