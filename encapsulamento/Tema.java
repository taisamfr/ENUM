package encapsulamento;

public class Tema {
    private long id;
    private String nome;
    private double valorAluguel;
    private String corToalha;

    public Tema(long id, String nome, double valorAluguel, String corToalha) {
        this.id = id;
        this.nome = nome;
        setValorAluguel(valorAluguel);
        this.corToalha = corToalha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        if (valorAluguel >= 0) {
            this.valorAluguel = valorAluguel;
        } else {
            System.out.println("Valor do aluguel inválido! Não pode ser negativo.");
        }
    }

    public String getCorToalha() {
        return corToalha;
    }

    public void setCorToalha(String corToalha) {
        this.corToalha = corToalha;
    }

    public void exibirInformacoes() {
        System.out.println("Tema: " + nome + ", Valor: R$ " + valorAluguel + ", Toalha: " + corToalha);
    }
}
