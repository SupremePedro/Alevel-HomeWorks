package AlevelHomeWorks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberInCharacters = reader.readLine();
        for (int i = 0; i < numberInCharacters.length(); i++) {
            int digit = numberInCharacters.charAt(i) - '0';
            if (digit % 2 == 0) {
                System.out.print("fizz");
            }
            if (digit % 3 == 0) {
                System.out.print("buzz");
            }
            System.out.println();


        }
    }
}
