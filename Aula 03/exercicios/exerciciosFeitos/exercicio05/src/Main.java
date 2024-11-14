public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("tobi",999,"demoniaca");
        System.out.println(cachorro);
        cachorro.latir();
        cachorro.correr();
    }
}