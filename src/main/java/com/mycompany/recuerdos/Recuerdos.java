/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recuerdos;

import java.util.Scanner;

/**
 *
 * @author JANETH
 */
public class Recuerdos {

    public static void main(String[] args){ 
        
        Scanner scanner=new Scanner(System.in);
        String[] David={"Viaje a la playa","Fiestas de Quito","Fiesta de halowin"};
        String[] Maria={"Caminatas","Cumpleaños","Turismo Galapagos"};
        String[] recuerdosFavoritos = new String[David.length + Maria.length];
        int contadorFavoritos = 0;
        
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
        
        System.out.println("Estos son los recuerdos de Maria.");
        for(int i=0;i<David.length;i++){
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
