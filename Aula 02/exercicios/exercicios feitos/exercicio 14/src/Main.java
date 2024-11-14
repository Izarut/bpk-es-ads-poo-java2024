import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String palavra = sc.nextLine();
        palavra = palavra.toLowerCase();
        int contagemVogais = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contagemVogais++;
            }
        }
        System.out.printf("Número de vogais: %d",contagemVogais);
    }
}