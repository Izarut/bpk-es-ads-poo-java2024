import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("digite o primeiro numero");
        num1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        num2 = sc.nextInt();
        System.out.printf("Soma = %d\n", num1 + num2);
        System.out.printf("Subtração = %d\n", num1 - num2);
        System.out.printf("Divisão = %d\n", num1 / num2);
        System.out.printf("Multiplicação = %d\n", num1 * num2);
    }
}