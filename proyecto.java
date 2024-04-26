


Import java.util.Scanner;

public class proyecto {

    public static void main(String[] args) {
    }    
        
        while (true) {
            System.out.println("conversor de monedas");
            System.out.println("1 - soles peruanos a dolares\n"
            + "2 - pesos mejicanos a dolares\n"
            + "3 - pesos colombianos a dolares\n"
            + "4 - salir");
            System.out.print("Ingrese una opcion:  ");
            Scanner leer = new Scanner(System.in);
            Char opcion = leer.next().charAt(0);

            switch (opcion) {
                case "1":
                    Convertir(3.58, "soles peruanos");
                    break;
                 
                case "2":
                    Convertir(22.15, "pesos mejicanos");
                    break;
                case "3":
                    Convertir(3851.90, "pesos colombianos");
                    break;
                case "4":
                    System.out.println(" Cerrando Programa "); 
                    break;
                default:
                    System.out.println(" Opcion Incorrecta ");
                    break;

            
                    
            }
        }

    }

    static Void convertir(double valordolar, string pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese el valor", pais);
        double  cantidadmoneda = leer.nextDouble();

        double dolares = cantidadmoneda / valordolar;

        dolares = (double) Math.round(dolares * 100d)/100;
        
        System.out.println( ----------------------------------------);
        System.out.println("      tienes $"+dolares+" dolares      ");
        System.out.println( ----------------------------------------);

    }





