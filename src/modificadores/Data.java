package modificadores;

public class Data {
    public String dia;
    public String mes;
    public String ano;

    public Data(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }


    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

