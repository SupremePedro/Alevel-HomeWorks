package ua.level.lesson3;

public class HomeWork3part2 {
    static int fibo(int i){
        if(i==1||i==2){
            return 1;
        }else {
            return fibo(i-1) + fibo(i-2);
        }
    }

    public static void main(String[] args) {
        for(int i = 1;i<=11;i++){
            System.out.println(HomeWork3part2.fibo(i));
        }

    }
}
