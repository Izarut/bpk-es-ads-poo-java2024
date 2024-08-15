import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        int opcao = 0;
        int chute = 0;
        int num = rand.nextInt(100)+1;
        for (int i = 0; i == 0;){
            System.out.print("Selecione a dificuldade.\n [1] Fácil (15 tentativas)\n [2] Médio (10 tentativas)\n [3] Difícil (5 tentativas)\n");
            opcao = sc.nextInt();
            switch(opcao) {
                case 1:
                    tentativas = 15;
                    i=1;
                    break;
                case 2:
                    tentativas = 10;
                    i=1;
                    break;
                case 3:
                    tentativas = 5;
                    i=1;
                    break;
                default:
                    System.out.print("digite uma opcao valida!\n");
            }
        }
        int acerto = 0;
        for (int i = 0; i < tentativas; i++){
            System.out.printf("adivinhe o numero entre 1 e 100. tentativa %d/%d\n", i+1, tentativas);
            chute = sc.nextInt();
            if (chute == num){
                System.out.printf("Parabens!!!! voce acertou em %d tentativas!\n", i+1);
                i=999;
                acerto = 1;
            } else if (chute < num) {
                System.out.print("o numero é maior!\n");
            } else {
                System.out.print("o numero é menor!\n");
            }
        }
        if (acerto == 1){
            System.out.print("Fim de Jogo. WP!");
        }else {
            System.out.print("Fim de Jogo. boa sorte na proxima :P");
        }
    }
}