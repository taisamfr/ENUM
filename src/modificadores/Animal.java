package modificadores;

public class Animal {
    private String cor;
    private float tamanho;

    //padrão
    public Animal(){
    }
    //com argumento
    public Animal(String cor) {
    this.cor=cor;
    }
    public Animal(String cor, float tamanho){
        this.cor= cor;
        this.tamanho=tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
}
