public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("Число " + i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i >= 0; i = i - 1) {
            System.out.println("Число " + i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 1) {
            System.out.println("Число " + i);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Число " + i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int m = 1904; m <= 2096; m = m + 4) {
            System.out.println(m + "Год является високосным");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int m = 7; m <= 98; m = m + 7) {
            System.out.println("Число " + m);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int m = 2; m <= 512; m = m * 2) {
            System.out.println("Число " + m);
        }
    }
}

