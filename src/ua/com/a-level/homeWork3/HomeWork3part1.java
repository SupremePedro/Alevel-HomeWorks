package ua.level.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HomeWork3part1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += number.charAt(i) - '0';
        }
        System.out.println("Сумма  = " + sum);
    }
}
