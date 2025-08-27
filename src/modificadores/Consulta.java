package modificadores;

public class Consulta {
    public Data data;
    public String nomePaciente;
    public String nomeDentista;

    public Consulta() {
    }

    public Consulta(Data data, String nomePaciente, String nomeDentista) {
        this.data = data;
        this.nomePaciente = nomePaciente;
        this.nomeDentista = nomeDentista;
    }
}
