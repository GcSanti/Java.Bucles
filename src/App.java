public class App {
    public static void main(String[] args) throws Exception {

        int numeroIf = 0; {
            if (numeroIf >0 ){
                System.out.println( "El valor de numeroif es:" + numeroIf + "es positivo");    
            }
            else if (numeroIf <0 ){
                System.out.println( "El valor de numeroif es:" + numeroIf + "es negativo");    
            }
            else{
                System.out.println("El valor de numeroif es: 0");}
        }

        int numeroWhile = 0;
            while (numeroWhile < 2){
                numeroWhile = numeroWhile + 1;{
                System.out.println("El valor de numeroWhile es:" + numeroWhile);}
        }

        int numeroDoWhile = 0;
            do{numeroDoWhile = numeroDoWhile + 3;
                System.out.println("El valor de numeroDoWhile es:"+ numeroDoWhile);
        }   while(numeroDoWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1){
        System.out.println("El valor de numeroFor es:" + numeroFor);
        }

        String estacion = "Verano";
            switch (estacion){
                case"Primavera":
                    System.out.println("Estacion actual:Primavera");
                        break;
                case"Otoño":
                    System.out.println("Estacion actual:Otoño");
                        break;
                case"Invierno":
                    System.out.println("Estacion actual:Invierno");
                        break;
                case"Verano":
                    System.out.println("Estacion actual:Verano");
                        break;
                default:
                    System.out.println("No se encuentra estacion");
        }
    }
}
