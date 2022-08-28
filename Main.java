public class Main {
    public static void main(String[] args){
        int valor = 0;

        if (valor == 0){
            System.out.println("El número es un 0");

        }
        if (valor < 0){
            System.out.println("El número es negativo");

        }
        if (valor > 0){
            System.out.println("El número es positivo");

        }
        int numeroWhile = -3;
        while (numeroWhile <= 3){
            System.out.println("El número es " + numeroWhile);
            numeroWhile++;
            if (numeroWhile == 4){
                System.out.println("Julius god");
            } 
    }
        do{ System.out.println("El número es " + numeroWhile);
                numeroWhile++;
                if (numeroWhile == 5){
                    System.out.println("Lulius god");
                }
            }while (numeroWhile <= 3);
        for(int numeroFor = 0;numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        var estacion = "Verano";
        switch(estacion){
            case "Primavera" :
                System.out.println("La estación es Primavera");
                break;
            case "Verano" :
                System.out.println("La estación es Verano");
                break;
            case "Otoño" :
                System.out.println("La estación es Otoño");
                break;
            case "Invierno" :
                System.out.println("La estación es Invierno");
                break;
            default :
                System.out.println("Eso no es una estación jeje");


    }
        }
}
