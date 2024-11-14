public class Celular{
    private String marca;
    private String modelo;
    private int capacidadeBateria;
    private boolean ligado = false;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }
    public void ligarCelular() {
        if(ligado) {
            ligado = false;
            System.out.println("desligando");
        }else{
            ligado = true;
            System.out.println("ligando");
        }
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeBateria=" + capacidadeBateria +
                ", ligado=" + ligado +
                '}';
    }
}
