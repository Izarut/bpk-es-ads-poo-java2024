import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        System.out.println("digite o primeiro numero");
        num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.printf("o número %d é par", num1);
        }else{
            System.out.printf("o número %d é impar", num1);
        }
    }
}