package ru.netology.services;

public class IncomeExpenseService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { //если денег на счету больше, чем порог
                count++; //отдыхаем
                money = (money - expenses) / 3; //необходимые траты и траты на отдых
            } else {
                money = money + income - expenses;// если нет, работаем
            }
        }
        return count;
    }
}