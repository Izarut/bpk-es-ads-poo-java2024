public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor(1000,"hamsterban",TipoCombustivel.ELETRICO,10,200);
        Carro carro1 = new Carro("randandandandandan",motor1);

        System.out.println(carro1);

        carro1.ligarDesligarCarro();

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();

        System.out.println(carro1);

        carro1.trocarMarcha();

        carro1.aumentarPotencia();
        carro1.aumentarPotencia();
        carro1.reduzirPotencia();

        carro1.ligarDesligarCarro();

        System.out.println(carro1);
    }
}