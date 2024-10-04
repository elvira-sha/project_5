package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelancerServiceTest {

    @Test
    void testFirstScenario() {
        FreelancerService service = new FreelancerService();
        int income = 10000;  // Доход фрилансера за месяц
        int expenses = 3000;  // Обязательные расходы за месяц
        int threshold = 20000;  // Порог, при котором можно отдыхать

        int expected = 3;  // Ожидаемый результат (3 месяца отдыха)
        int actual = service.calculate(income, expenses, threshold);  // Вызов метода

        Assertions.assertEquals(expected, actual);  // Проверка результата
    }

    @Test
    void testSecondScenario() {
        FreelancerService service = new FreelancerService();
        int income = 100000;  // Доход фрилансера за месяц
        int expenses = 60000;  // Обязательные расходы за месяц
        int threshold = 150000;  // Порог, при котором можно отдыхать

        int expected = 2;  // Ожидаемый результат (2 месяца отдыха)
        int actual = service.calculate(income, expenses, threshold);  // Вызов метода

        Assertions.assertEquals(expected, actual);  // Проверка результата
    }
}
