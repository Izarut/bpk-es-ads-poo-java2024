public class Motor {
    private int cilindradas;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private int rpm;
    private int potencia;
    private boolean ligado;

    public Motor(int cilindradas, String modelo, TipoCombustivel tipoCombustivel, int rpm, int potencia) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.potencia = potencia;
        this.ligado = false;
    }
    public void ligarDesligarMotor(){
        if(ligado == true){
            ligado = false;
            System.out.println("Motor desligado");
        }else{
            ligado = true;
            System.out.println("Motor ligado");
        }
    }
    public void aumentarPotencia(){
        potencia += 10;
        System.out.println("AOOO POTENCIA!!");
    }
    public void diminuirPotencia(){
        if (potencia - 10 > 0){
            System.out.println("diminuindo potencia :(");
            potencia -= 10;
        }else{
            System.out.println("n da pra ter potencia negativa");
        }
    }
    public void aumentarRpm(){
        rpm += 10;
        System.out.println("RPM aumentado chefia!");
    }
    public void diminuirRpm(){
        if (rpm - 10 > 0){
            System.out.println("diminuindo rpm :(");
            rpm -= 10;
        }else {
            System.out.println("foguete n da ré, velocidade negativa jamais!");
        }
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindradas=" + cilindradas +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustivel=" + tipoCombustivel +
                ", rpm=" + rpm +
                ", potencia=" + potencia +
                ", ligado=" + ligado +
                '}';
    }
}
