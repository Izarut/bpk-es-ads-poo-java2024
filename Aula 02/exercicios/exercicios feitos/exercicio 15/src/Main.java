import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um numero: \n");
        int num = sc.nextInt();

        int fNormal = jeitoNormal(num);
        System.out.printf("Fatorial coisa: %d\n",fNormal);

        int fRecurcivo = recurcividades(num);
        System.out.printf("Fatorial recursivo: %d",fRecurcivo);
    }

    public static int jeitoNormal(int n) {
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static int recurcividades(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * recurcividades(n - 1);
        }
    }
}