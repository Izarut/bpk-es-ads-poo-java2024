public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(123123,2500);
        conta.depositar(999);
        conta.sacar(1000000);
        conta.sacar(999);
        System.out.println(conta);
    }
}