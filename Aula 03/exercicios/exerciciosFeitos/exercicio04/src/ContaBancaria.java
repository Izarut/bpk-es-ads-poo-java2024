public class ContaBancaria {
    private int numero;
    private int saldo;

    public ContaBancaria(int numero, int saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    public void depositar(int valor) {
        this.saldo += valor;
        System.out.println("depositando o dinheirinho");
    }
    public void sacar(int valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }else{
            System.out.println("tu n tem dinheiro pobre");
        }
    }

    @Override
    public String toString() {
        return "contaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
