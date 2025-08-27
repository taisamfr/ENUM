package modificadores;

public class ObjetoConsulta {
    public static void main(String[] args) {
        // Criando objetos de Data
        Data data1 = new Data("28", "08", "2025");
        Data data2 = new Data("29", "08", "2025");

        // Criando consultas
        Consulta consulta1 = new Consulta(data1, "Carlos", "Dra. Taisa Reis");
        Consulta consulta2 = new Consulta(data2, "Francisco", "Dra. Taisa Reis");

        // Exibindo informações
        System.out.println("Consulta 1:");
        System.out.println("Data: " + consulta1.data);
        System.out.println("Paciente: " + consulta1.nomePaciente);
        System.out.println("Dentista: " + consulta1.nomeDentista);

        System.out.println("\nConsulta 2:");
        System.out.println("Data: " + consulta2.data);
        System.out.println("Paciente: " + consulta2.nomePaciente);
        System.out.println("Dentista: " + consulta2.nomeDentista);
    }
}
