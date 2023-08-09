public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 0; i < 10; i ++) {
            System.out.println("Итерация цикла" + i);
        }

        for (int i = 1; i <= 10; i ++) {
            System.out.println("Итерация цикла " + i);
        }

        for (int i = 10; i >= 1; i --) {
            System.out.println("Итерация цикла " + i);
        }

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }

        for (int i = 10; i >= -10; i --) {
            System.out.println("Итерация цикла " + i);
        }

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        int salary = 65535;
        double total = 0;

        int salaryWithPenny = salary * 100;
        int totalWithPenny = 0;

        for (int i = 1; i <= 12; i ++) {
            totalWithPenny = totalWithPenny + totalWithPenny / 100;
            totalWithPenny = totalWithPenny + salaryWithPenny;

            total = totalWithPenny / 100;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);

        int capital = 29000;
        int totalcapital = 0;

        for (int i = 1; i <= 12; i ++) {
            totalcapital = totalcapital + capital;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalcapital + " рублей");
        }

    }
}