/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import java.util.Locale;
import java.util.Scanner;
import paquete01.Enlace;
import paquete02.Auto;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) throws SQLException {
        Scanner leer = new Scanner(System.in);
        leer.useLocale(Locale.US);
        Enlace c = new Enlace();
        Auto a = new Auto();
        double matricula;
        String placa;
        
        int opc = 0;
        do {
            System.out.print("Ingrese la placa: ");
            placa = leer.nextLine();
            a.establecerPlaca(placa); 
            
            System.out.print("Ingrese el valor de la matricula: ");
            matricula = leer.nextDouble();
            a.establecerValorMatricula(matricula);
            
            c.insertarAuto(a);
            System.out.println("***Salir del programa [0]");
            System.out.println("***Ingresar nueva Placa [1]");
            System.out.print("Ingrese la opcion requerida: ");
            opc = leer.nextInt();
            System.out.println("");
            leer.nextLine();
            
        } while (opc != 0);
        
        System.out.println("--- ha salido del programa ----");
        
    }
}
