package encapsulamento;

public class Endereco {
    public Endereco(int i, String ruaCarolina, int i1, String casa48, String centro, String rioDeJaneiro, String s, String sp) {
    }

    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Taisa Reis ", "99569-1556", "653.369.987-98", "698.365.981-5");
        Endereco endereco = new Endereco(1, "Rua Francisco", 277, "Casa55", "Centro", "Florianópolis", "04009-007", "SC");
        Tema tema = new Tema(1, "Aniversário", 500.00, "Vermelha");
        ItemTema item = new ItemTema(1, "Flores", "Decoração vermelha e branca");

        cliente.exibirInformacoes();
        endereco.exibirInformacoes();
        tema.exibirInformacoes();
        item.exibirInformacoes();
    }

    private void exibirInformacoes() {

    }
}
