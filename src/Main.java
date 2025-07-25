//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        int total = 0;
        int deposit = 15_000;
        int month = 0;
        int target = 2_459_000;
        while (total <= target) {
            month = month + 1;
            total = total + deposit;
        }
        System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");

        //task2
        int number = 1;
        target = 10;
        while (number < target) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int i = target; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task3 цикл for т.к. есть определенное значение циклов
        int populationCountry = 12_000_000;
        int birthrate = 17;
        int mortality = 8;
        for (int i = 1; i <= 10; i++) {
            populationCountry = populationCountry + populationCountry / 1000 * (birthrate - mortality);
            System.out.println("Год " + i + " численность населения сотавляет " + populationCountry);
        }

        //task4
        double depositBank = 15_000;
        double percentMonth = 0.07;
        int depositTargetBank = 12_000_000;
        month = 0;
        while (depositBank < depositTargetBank) {
            depositBank = depositBank + depositBank * percentMonth;
            month++;
            System.out.println("Сумма за " + month + " месяц " + depositBank);
        }
        System.out.println("Кол-во месяцев: " + month);

        //task5
        depositBank = 15_000;
        percentMonth = 0.07;
        depositTargetBank = 12_000_000;
        month = 0;
        while (depositBank < depositTargetBank) {
            depositBank = depositBank + depositBank * percentMonth;
            month++;
            if (month % 6 == 0) {
                System.out.println("Сумма за " + month + " месяц " + depositBank);
            }
        }

        //task6
        depositBank = 15_000;
        percentMonth = 0.07;
        for (double i = 0.5; i <= 9; i = i + 0.5) {
            depositBank = depositBank + depositBank * percentMonth * 0.5;
            System.out.println(i + " " + depositBank);
        }

        //task7
        int day = 1;
        for (int i = day; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет");
        }

        //task8
        int currentYear = 2025;
        for (int i = 0; i <= (currentYear + 100); i = i + 79) {
            if (i > (currentYear - 200) && i < (currentYear + 100)) {
                System.out.println(i);
            }
        }
    }
}