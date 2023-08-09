public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 0; i < 10; i ++) {
            System.out.println("Итерация цикла" + i);
        }

        for (int i = 1; i <= 10; i ++) {
            System.out.println("Итерация цикла" + i);
        }

        for (int i = 10; i >= 1; i --) {
            System.out.println("Итерация цикла" + i);
        }

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла" + i);
        }

        for (int i = 10; i >= -10; i --) {
            System.out.println("Итерация цикла" + i);
        }

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + "год является високосным");
        }

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }
}