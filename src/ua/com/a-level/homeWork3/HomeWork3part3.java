package ua.level.lesson3;

public class HomeWork3part3 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 1000000; i++) {
            int a = i / 100000;
            int b = (i % 100000) / 10000;
            int c = (i % 10000) / 1000;
            int d = (i % 1000) / 100;
            int e = (i % 100) / 10;
            int f = i % 10;
            if (a + b + c == d + e + f) {
                count++;
            }

        }
        System.out.println("Количество счастливых билетов = " + count);
    }
}
