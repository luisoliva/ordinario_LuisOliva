/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.ibm;

/**
 *
 * @author luisoliva
 */
public class IbmController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteOldPerson viejo = new ConcreteOldPerson("Luis Oliva");
        ConcreteNewPerson nuevo = new ConcreteNewPerson("Luis",  "Oliva");
                
        System.out.println("Ejemplo de persona en formato antiguo");
        System.out.println("Nombre completo: "+viejo.getFullname());
        
        System.out.println("\nEjemplo de persona en formato nuevo");
        System.out.println("Nombre: "+nuevo.getName() + "\nApellido: " + nuevo.getLastname());
        
        System.out.println("\nCargando catalogo en formato antiguo...");
        Catalogo catalogo = new Catalogo();
     
        printCatalogoOriginal(catalogo);
        printCatalogoAdaptado(catalogo);
       
    }
    
    public static void printCatalogoOriginal(Catalogo catalogo){
        System.out.println("\nPersonas formato original");
        for (int i=0;i<catalogo.personas.size();i++){
            System.out.println("Nombre->" + catalogo.personas.get(i).getFullname());
        }
    }
    
    public static void printCatalogoAdaptado(Catalogo catalogo){
        System.out.println("\nPersonas formato nuevo");
        for (int i=0;i<catalogo.personas.size();i++){
            NewPerson adaptado = new PersonAdapter(catalogo.personas.get(i));
            System.out.println("Nombre->" + adaptado.getName() + "  Apellido->" + adaptado.getLastname());
        }
    }
    
}
