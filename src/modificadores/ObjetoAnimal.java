package modificadores;

public class ObjetoAnimal {
    public static void main(String[]args){
        Animal animal1 = new Animal();
        Animal animal2= new Animal("caramelo", 10);
        Animal animal3= new Animal("marrom", 56);

        System.out.println(animal2.getCor());
        System.out.println(animal2.getTamanho());

        System.out.println(animal3.getCor());
        System.out.println(animal3.getTamanho());

    }
}
