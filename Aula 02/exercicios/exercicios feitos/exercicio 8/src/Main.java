import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("digite sua idade: ");
        int idade = sc.nextInt();
        System.out.printf("Bom-dia %s, bom saber que vc tem %d anos\n", nome, idade);
    }
}