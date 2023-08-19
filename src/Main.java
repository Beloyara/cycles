public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

// 1 задача
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла" + i);
        }

// 1 задача
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }

// 2 задача
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }

// 3 задача
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }

// 4 задача
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }

// 5 задача
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

// 6 задача
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

// 7 задача
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

// задача из видео
        int salary = 65535;
        double total = 0;

        int salaryWithPenny = salary * 100;
        int totalWithPenny = 0;

        for (int i = 1; i <= 12; i++) {
            totalWithPenny = totalWithPenny + totalWithPenny / 100;
            totalWithPenny = totalWithPenny + salaryWithPenny;

            total = totalWithPenny / 100;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);

//Новое решение 8 задачи
        int contribution = 29_000;
        int sum = 0;
        for (int i = 1; i <= 12; i++)
        {
            sum = sum + contribution;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum + " рублей");
        }

//Новое Решение 9 задачи
        double contribution2 = 29_000;
        double sum2 = 0;
        for (int i = 1; i <= 12; i++)
        {
            sum2 *= 1.01;
            sum2 += contribution2;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum2 + " рублей");
        }

//10 задача
        for (int i = 1; i <= 10; i ++) {
            int f = 2 * i;
            System.out.println("2 * " + i + " = " + f);
        }
    }
}