/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        Scanner leer = new Scanner(System.in);
        int poblacion;
        String nombreC;
        int opc = 0;
        Enlace c = new Enlace();
        do {
            System.out.print("Ingrese el nombre de la ciudad: ");
            nombreC = leer.nextLine();

            System.out.print("Ingrese la poblacion de la ciudad: ");
            poblacion = leer.nextInt();

            
            Ciudad ciudad = new Ciudad(nombreC, poblacion);
            c.insertarCiudad(ciudad);
            
            System.out.println("***Salir del programa [0]");
            System.out.println("***Ingresar nueva ciudad [1]");
            System.out.print("Ingrese la opcion requerida: ");
            opc = leer.nextInt();
            System.out.println("");
            leer.nextLine();
            
        } while (opc != 0);
        
        System.out.println("--- ha salido del programa ----");
        //for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
        //    System.out.printf("%s", c.obtenerDataCiudad().get(i));
        //}
    }
}
