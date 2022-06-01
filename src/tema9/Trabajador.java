package tema9;

public class Trabajador extends Persona{

    private double salario;

    public Trabajador(){
        super();
    }

    public Trabajador(int edad, String nombre, int telefono, double salario){
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Trabajador" + "\n--------------" + super.toString() + "Salario: " + salario + "\n";
    }
}
