/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.ibm;

import java.util.ArrayList;

/**
 *
 * @author luisoliva
 */
public class Catalogo {
    public ArrayList<ConcreteOldPerson> personas;
    
    public Catalogo(){
        this.personas = new ArrayList();
        this.personas.add(new ConcreteOldPerson("Juan Guitierrez"));
        this.personas.add(new ConcreteOldPerson("Jose Alama"));
        this.personas.add(new ConcreteOldPerson("Saul Bonilla"));
        this.personas.add(new ConcreteOldPerson("Jesus Cals"));
        this.personas.add(new ConcreteOldPerson("Ramon Hernandaz"));
        this.personas.add(new ConcreteOldPerson("Alan Paredes"));
        this.personas.add(new ConcreteOldPerson("Sebastian Montoya"));
        this.personas.add(new ConcreteOldPerson("Ricardo Perez"));
        this.personas.add(new ConcreteOldPerson("Karen Arenas"));
        this.personas.add(new ConcreteOldPerson("Katia Solorzano"));
        this.personas.add(new ConcreteOldPerson("Benjamin Monterroza"));

    }
}
