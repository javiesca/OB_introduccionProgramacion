package tema9;

public class Cliente extends Persona{

    private double credito;

    public Cliente(){
        super();
    }

    public Cliente(int edad, String nombre, int telefono, double credito){
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String toString() {
        return "Cliente" + "\n--------------" + super.toString() + "Credito: " + credito + "\n";
    }
}
