/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

/**
 *
 * @author luisoliva
 */
public class SageController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Creando personas...");
        Persona luis = new DirectorSMS("Luis");
        Persona juan = new DirectorEmailSMS("Juan");
        Persona patricia = new DirectorEmail("Patricia");
        
        System.out.println("Creando bitacora de compras...");
        Bitacora bitacora = new Bitacora();
        
        System.out.println("Asignando observadores...");
        bitacora.setPersona(luis);
        bitacora.setPersona(juan);
        bitacora.setPersona(patricia);
    
        System.out.println("Agregando compras...");
        bitacora.setGasto(new Gasto("Madera", 67.3f));
        bitacora.setGasto(new Gasto("Equipo de computo", 12.3f));
        bitacora.setGasto(new Gasto("Tubos de PVC", 234f));
        bitacora.setGasto(new Gasto("mantenimiento", 12.2f));
        
        System.out.println("\nNotificaciones pausadas para Luis");
        bitacora.deleteObserverFromList(luis);
        
        System.out.println("Agregando mas compras...");
        bitacora.setGasto(new Gasto("Cristal", 67.3f));
        bitacora.setGasto(new Gasto("Carbon", 102f));
        bitacora.setGasto(new Gasto("Magnesio", 12.3f));
        
        System.out.println("\nNotificaciones pausadas para Juan");
        bitacora.deleteObserverFromList(juan);
        
        System.out.println("\nAgregando mas compras...");
        bitacora.setGasto(new Gasto("Tela", 67.3f));
        bitacora.setGasto(new Gasto("Plastico", 1230.2f));
        bitacora.setGasto(new Gasto("Metal", 12.3f));
        
        System.out.println("\nNotificaciones pausadas para todos");
        bitacora.pauseNotifications();
        
        System.out.println("\nAgregando mas compras...");
        bitacora.setGasto(new Gasto("Algodon", 67.3f));
        bitacora.setGasto(new Gasto("Alcohol", 767f));
        bitacora.setGasto(new Gasto("Ceramica", 12.3f));
        
        System.out.println("\nImprimiendo logs de mensajes...");
        bitacora.printLogs();

        System.out.println("\nImprimiendo reporte compras...");
        bitacora.printReport();
    }
    
}
