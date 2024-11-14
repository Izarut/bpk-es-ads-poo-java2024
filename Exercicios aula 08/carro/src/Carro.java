import java.util.Random;

public class Carro {
    private String modelo;
    private Motor motor;
    private int marcha = 1;
    private boolean ligado = false;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void acelerar() {
        motor.aumentarRpm();
    }
    public void frear() {
        motor.diminuirRpm();
    }
    public void trocarMarcha(){
        if(marcha > 0 || marcha < 6){
            marcha++;
        }else{
            marcha = 2;
        }
    }
    public void ligarDesligarCarro(){
        if(ligado == false){
            System.out.println("ligando carro..");
            ligado = true;
            motor.ligarDesligarMotor();
        }else{
            System.out.println("Desligando carro..");
            ligado = false;
            motor.ligarDesligarMotor();
        }
    }
    public void reduzirPotencia(){
        motor.diminuirPotencia();
    }
    public void aumentarPotencia(){
        motor.aumentarPotencia();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", motor=" + motor +
                ", marcha=" + marcha +
                ", ligado=" + ligado +
                '}';
    }
}
