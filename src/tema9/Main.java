package tema9;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(25,"Pepe",689541236,45500);

        Trabajador trabajador = new Trabajador(31,"Marcos",612365478,1800);

        System.out.println(cliente);

        System.out.println(trabajador);
    }
}
