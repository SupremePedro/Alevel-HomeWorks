package ua.level.lesson3;
import java.util.Random;
public class HomeWork3part5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int rows= 8;
        int columns = 5;
        int a = 10;
        int b = 99;
        int [][] arr  = new int [rows][columns];
        for(int i =0; i<rows; i++){
            for(int j = 0;j<columns;j++){
                arr[i][j] = rand.nextInt(89)+10;
            }
        }
        for(int i =0; i<rows; i++){
            for(int j = 0;j<columns;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
