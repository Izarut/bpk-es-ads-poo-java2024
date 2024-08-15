import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("+ = 1   - = 2   * = 3   / = 4\n");
        System.out.println("escolha um operador: ");
        int sinal = sc.nextInt();
        System.out.printf("Digite o primeiro numero: \n");
        int num1 = sc.nextInt();
        System.out.printf("Digite o segundo numero: \n");
        int num2 = sc.nextInt();

        switch (sinal) {
            case 1:
                System.out.printf("a soma dos numeros eh igual a %d\n", num1 + num2);
                break;

            case 2:
                System.out.printf("a subtracao dos numeros eh igual a %d\n", num1 - num2);
                break;

            case 3:
                System.out.printf("a multiplicacao dos numeros eh igual a %d\n", num1 * num2);
                break;

            case 4:
                System.out.printf("a divisao dos numeros eh igual a %d\n", num1 / num2);
                break;
        }
    }
}