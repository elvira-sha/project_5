package ru.netology.services;

public class FreelancerService {

    /**
     * Метод для расчёта количества месяцев отдыха за год.
     * @param income доход фрилансера за месяц
     * @param expenses обязательные расходы фрилансера за месяц
     * @param threshold порог денег на счёте, при котором можно отдыхать
     * @return количество месяцев отдыха в году
     */
    public int calculate(int income, int expenses, int threshold) {
        int restMonths = 0;  // Счётчик месяцев отдыха
        int money = 0;  // Текущие накопления

        // Цикл по каждому месяцу в году (всего 12 месяцев)
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {  // Если денег хватает для отдыха
                restMonths++;  // Увеличиваем количество месяцев отдыха
                money = money - expenses;  // Вычитаем обязательные расходы
                money = money - (money / 3);  // Дополнительно тратим треть накоплений на отдых
            } else {  // Если денег не хватает для отдыха
                money = money + income - expenses;  // Фрилансер работает: доход минус расходы
            }
        }
        return restMonths;  // Возвращаем количество месяцев отдыха
    }
}
