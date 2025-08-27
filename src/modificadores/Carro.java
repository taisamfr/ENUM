package modificadores;

public class Carro {
    private String placa;
    private int numChassi;

    //CONSTRUTOR PADRÃO
    public Carro (){

    }

    //metodo com argumento
    public Carro(String placa){
        this.placa= placa;
    }

    public Carro(String placa, int numChassi){
        this.placa = placa;
        this.numChassi = numChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
}
