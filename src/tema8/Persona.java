package tema8;

public class Persona {

    //atributos
    private int edad;
    private String nombre;
    private int telefono;

    //constructores
    public Persona(){

    }

    public Persona(int edad, String nombre, int telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //metodos
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Edad: " + edad + "\nNombre: " + nombre + "\nTelefono: " + telefono +"\n";
    }
}
