package one.digitalinnovation.oo;

public class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setModelo("Chevrolet ONIX 1.0");
        carro1.setCapacidadeTanque(50d);
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(4.35));
        System.out.println();

        Carro carro2 = new Carro("Marrom","Fiat FastBack 1.0 Turbo",65);
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(4));
        System.out.println();
    }
}
