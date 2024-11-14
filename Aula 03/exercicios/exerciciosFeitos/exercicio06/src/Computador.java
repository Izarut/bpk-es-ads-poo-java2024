public class Computador {
    private String processador;
    private int memoriaRam;
    private int armazenamento;
    private boolean ligado = false;

    public Computador(String processador, int memoriaRam, int armazenamento) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }
    public void ligarDesligar(){
        if(ligado){
            ligado = false;
            System.out.println("desligando");
        }else{
            ligado = true;
            System.out.println("ligando");
        }
    }

    @Override
    public String toString() {
        return "Computador{" +
                "processador='" + processador + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", armazenamento=" + armazenamento +
                ", ligado=" + ligado +
                '}';
    }
}
