package tema4;

public class ejercicioTema4 {

    public static void main(String[] args) {

        /*
        Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
         */

        int numeroIf = 5;
        System.out.println("PRIMERA PARTE");
        System.out.println("-------------------------------");
        if(numeroIf > 0){
            System.out.println("El número " + numeroIf + " es positivo.");
        }else if (numeroIf < 0){
            System.out.println("El número " + numeroIf + " es negativo.");
        }else{
            System.out.println("El número " + numeroIf + " es 0.");
        }

        /*
        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:
        - Incrementar el valor de la variable en uno cada vez que se ejecute.
        - Mostrarlo por pantalla cada vez que se ejecute.
         */
        System.out.println();
        System.out.println("SEGUNDA PARTE");
        System.out.println("-------------------------------");
        int numeroWhile = 0;

        while(numeroWhile < 2){
            numeroWhile++;
            System.out.println("Ahora numeroWhile vale " + numeroWhile);
        }

        /*
        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
         */

        System.out.println();
        System.out.println("TERCERA PARTE");
        System.out.println("-------------------------------");
        int numeroDoWhile = 0;

        do{
            numeroDoWhile++;
        }while (numeroDoWhile<2);
        System.out.println("NumeroDoWhile vale: " + numeroDoWhile);

        /*
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la
        variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse
        por pantalla.
         */

        System.out.println();
        System.out.println("CUARTA PARTE");
        System.out.println("-------------------------------");
        int numeroFor = 0;

        for(int i = 0; i < 3; i++){
            numeroFor++;
            System.out.println("numeroFor vale: " + numeroFor);
        }

        /*
         Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del
         año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la
         estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una
         estación.
         */

        System.out.println();
        System.out.println("QUINTA PARTE");
        System.out.println("-------------------------------");
        String mes = "Julio";

        switch(mes){
            case "Diciembre":
            case "Enero":
            case "Febrero":
                System.out.println("Invierno");
                break;
            case "Marzo":
            case "Abril":
            case "Mayo":
                System.out.println("Primavera");
                break;
            case "Junio":
            case "Julio":
            case "Agosto":
            case "Septiembre":
                System.out.println("Verano");
                break;
            case "Octubre":
            case "Noviembre":
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Mes incorrecto");
                break;
        }
    }
}
