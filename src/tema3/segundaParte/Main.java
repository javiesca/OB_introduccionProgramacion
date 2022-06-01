package tema3.segundaParte;

public class Main {

    public static void main(String[] args) {

        Coche coche = new Coche(3);

        System.out.println("Este coche tiene: " + coche.getNumPuertas());

        coche.incrementaPuertas();

        System.out.println("Ahora este coche tiene: " + coche.getNumPuertas());
    }
}
