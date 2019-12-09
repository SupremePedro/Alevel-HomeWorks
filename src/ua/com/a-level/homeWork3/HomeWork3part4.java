package ua.level.lesson3;

public class HomeWork3part4 {
    public static void main(String[] args) {
        int count = 0;

        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                int a = hour / 10;
                int b = hour % 10;
                int c = minute / 10;
                int d = minute % 10;
                if (a == d && b == c) {
                    count++;
                }
            }
        }
        System.out.println("Количество симметричных комбинаций  = " + count);
    }
}
