import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("vc vai digitar em oq?\n[1]Celcius\n[2]Fahrenheit\n");
        int choice = sc.nextInt();
        System.out.print("blz, digita ai quantos grau ta fazendo de quentura\n");
        int temp = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.printf("%d celcius em fahrenheit da maizomenos %.2f grau ", temp, temp*1.8+32);
                break;
            case 2:
                System.out.printf("%d fahrenheit em celcius da maizomeno %.2f grau ", temp, temp/1.8-32);
                break;
            default:
                int choise2 = 0;
                System.out.print("vai ter q resetar o bgl pq tu digitou erradokkkkk. burrice ou missclick?\n");
                System.out.print("[1] burrice\n[2] missclick\n[3]burrice eh esses seus codigo, vo te da 0 nesses exercicio, ate crianca faz melhor\n");
                choise2 = sc.nextInt();
                if (choise2 == 1) {
                    System.out.print("q isso, se xinga nn po, contece, tava brincando");
                }else if (choise2 == 2) {
                    System.out.print("eh mole man, mas reseta ai e corrige certin po");
                }else if (choise2 == 3) {
                    System.out.print("foi mal professor, tava so brincando po :( desculpa");
                }else {
                    System.out.print("vou considerar burrice, pq 2 vez seguida eh foda");
                }
                break;
        }
    }
}