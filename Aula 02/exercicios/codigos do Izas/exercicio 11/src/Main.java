import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite uma palavra: ");
        String word = sc.nextLine();
        int banana = 0;
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) == word.charAt(word.length()-i-1)) {
                banana++;
            }
        }
        if (banana == word.length()/2) {
            System.out.print("eh um palindromo");
        }else {
            System.out.print("nao eh um palindromo");
        } //caralho professor, aqui eu trancendi, fale tu viadokkkkkkk mt foda esse codigo
    }     //to orgulhoso disso aqui
}