package tema8;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.setEdad(38);
        persona1.setNombre("Javier");
        persona1.setTelefono(654987321);

        persona2.setEdad(29);
        persona2.setNombre("Marian");
        persona2.setTelefono(647256321);

        System.out.println(persona1);
        System.out.println(persona2);
    }
}
