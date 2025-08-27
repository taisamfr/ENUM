package modificadores;

public class ObjetoCarro {
    public static void main(String[]agrs){
        Carro carro1 = new Carro();
        Carro carro2 = new Carro("ABC1D23",91256);
        Carro carro3 = new Carro("XYZ9K87", 45896);

        System.out.println(carro2.getPlaca());
        System.out.println(carro2.getNumChassi());

        System.out.println(carro3.getPlaca());
        System.out.println(carro3.getNumChassi());

    }
}
