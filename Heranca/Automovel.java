package Heranca;

public class Automovel extends Veiculo {
    private String motor;
    private int numeroPortas;

    public Automovel(String marca, String modelo, String cor, int ano, double motor, int numeroPortas) {
        super(marca, modelo, cor, ano);
        this.motor = motor;
        this.numeroPortas = numeroPortas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
