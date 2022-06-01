package tema3.primeraParte;

public class primeraParte {

    public static void main(String[] args) {
        double resultado;
        resultado = sumaNumeros(2,4,6);

        System.out.println("El resultado es: " + resultado);

    }

    public static double sumaNumeros(int num1, int num2, int num3){
        return num1 + num2 +num3;
    }
}
