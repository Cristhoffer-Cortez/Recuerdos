/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuerdos;
import java.util.Scanner;

/**
 *
 * @author Laboratorios DCCO
 */
public class Recuerdos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scanner=new Scanner(System.in);
       int cantidad;
       System.out.println("Cuantos recuerdos quieres ingresar.");
       cantidad=scanner.nextInt();
       scanner.nextLine();
       
       String[] David=new String[cantidad];
       String[] Maria=new String[cantidad];
        //String[] David={"Viaje a la playa","Fiestas de Quito","Fiesta de halowin"};
        //String[] Maria={"Caminatas","Cumpleaños","Turismo Galapagos"};
        
        String[] recuerdosFavoritos = new String[David.length + Maria.length];
        int contadorFavoritos = 0;
        
        System.out.println("Escribe los recuerdos de David.");
        for(int i=0;i<David.length;i++){
            David[i]=scanner.nextLine();
        }
        
        System.out.println("Estos son los recuerdos de David.");
        for(int i=0;i<David.length;i++){
            System.out.println((i+1)+". "+David[i]);
        }       
        System.out.println("Elige un recuerdo de David separado por (,).");
        String rDavid = scanner.nextLine();
        if (!rDavid.isEmpty()) {
            String[] indicesDavid = rDavid.split(",");
            for (String indice : indicesDavid) {
                int pos = Integer.parseInt(indice.trim())-1;
                if (pos >= 0 && pos < David.length) {
                    recuerdosFavoritos[contadorFavoritos] = David[pos];
                    contadorFavoritos++;
                } else {
                    System.out.println("No existe el indice: " + (pos + 1));
                }
            }
        }
        System.out.println("");
        System.out.println("Escribe los recuerdos de Maria.");
        for(int i=0;i<Maria.length;i++){
            Maria[i]=scanner.nextLine();
        }
        System.out.println("Estos son los recuerdos de Maria.");
        for(int i=0;i<Maria.length;i++){
            System.out.println((i+1)+". "+Maria[i]);
        }
        System.out.println("Elige los recuerdos de Maria separados por (,)");
        String rMaria = scanner.nextLine();
        if (!rMaria.isEmpty()) {
            String[] indicesMaria = rMaria.split(",");
            for (String indice : indicesMaria) {
                int pos = Integer.parseInt(indice.trim())-1;
                if (pos >= 0 && pos < Maria.length) {
                    recuerdosFavoritos[contadorFavoritos] = Maria[pos];
                    contadorFavoritos++;
                } else {
                    System.out.println("No existe el indice: " + (pos + 1));
                }
            }
        }
        System.out.println("");
        System.out.println("Tus recuerdos favoritos convinados son:");
        if (contadorFavoritos == 0) {
            System.out.println("No seleccionaste ningún recuerdo.");
        } else {
            for (int i = 0; i < contadorFavoritos; i++) {
                System.out.println("- " + recuerdosFavoritos[i]);
            }
        }
    }
    
}
