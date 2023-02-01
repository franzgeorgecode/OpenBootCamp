public class Main {
    public static void main(String[] args) {

        //USANDO IF

        int numeroIF = 3;

        if (numeroIF>0){
            System.out.println("la variable numeroIF es: " + numeroIF + " por lo tanto es un numero positivo");

        } else if (numeroIF<0){
            System.out.println("la variable numeroIF es: " + numeroIF + " por lo tanto es un numero negativo");

        } else {
            System.out.println("la variable numeroIF es: " + numeroIF + " por lo tanto es igual a cero");
        }

      // USANDO WHILE
        int numeroWhile=0;

        while(numeroWhile<3){
            numeroWhile++;
            System.out.println("la variable numeroWhile es: " + numeroWhile);
        }

        //USANDO DO WHILE
        int numeroDoWhile=1;
        do{numeroDoWhile++;
            System.out.println("la variable numeroDoWhile es: " + numeroDoWhile);

        }while(numeroDoWhile<1);


      // USANDO FOR


        for(int numeroFor = 0;numeroFor<=3; numeroFor++){
            System.out.println("la variable numeroFor es: " + numeroFor);
        }

      // USANDO SWITCH

        String estacion = "Primavera";
        switch(estacion){
            case"Primavera":
                System.out.println("Disfruta que es Primavera");
                break;
            case"Verano":
                System.out.println("Disfruta que es Verano");
                break;
            case"Otoño":
                System.out.println("Disfruta que es Otoño");
                break;
            case"Invierno":
                System.out.println("Disfruta que es Invierno");
                break;
            default:
                System.out.println("El valor de la variable no sea una Estación");
        }




    }
}