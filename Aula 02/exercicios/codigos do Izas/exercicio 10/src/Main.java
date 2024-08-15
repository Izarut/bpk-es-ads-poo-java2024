import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        int prime = primo(num);
        if (prime == 1) {
            System.out.printf("o número %d é primo\n", num);
        }else{
            System.out.printf("o número %d não é primo\n", num);
        }
    }

    public static int primo(int num) {
        for (int i = 2; i <= num /2; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}