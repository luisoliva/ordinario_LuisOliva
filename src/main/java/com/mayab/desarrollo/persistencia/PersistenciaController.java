/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.persistencia;

/**
 *
 * @author luisoliva
 */
public class PersistenciaController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ManejadorDB manejador = new DBA();
        System.out.println("Usando " + manejador.tipo + "...\n");
        manejador.guardarDatos();
               
        manejador = new DBB();
        System.out.println("\nUsando " + manejador.tipo + "...\n");
        manejador.guardarDatos();
                
        manejador = new DBC();
        System.out.println("\nUsando " + manejador.tipo + "...\n");
        manejador.guardarDatos();
    }
    
}
