package tema3.segundaParte;

public class Coche {
    // Atributos
    private int numPuertas;

    // Constructores
    public Coche(){

    }

    public Coche (int numPuertas){
        this.numPuertas = numPuertas;
    }

    // Metodos

    //getters and setters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    // incrementa el numero de puertas en 1
    public void  incrementaPuertas(){
         numPuertas++;
    }
}
