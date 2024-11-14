import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i<5; i++){
            System.out.printf("digite um numero, %d/5\n",(i+1));
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        for (int i = 0; i<5; i++){
            System.out.printf("%d ",numbers[i]);
        }
    }
}