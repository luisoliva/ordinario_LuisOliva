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
public class PersonAdapter implements NewPerson{
    public OldPerson adaptada;

    public PersonAdapter(OldPerson nueva){
        this.adaptada=nueva;
    }

    @Override
    public String getName() {
        String cadena=this.adaptada.getFullname();
        String[] parts = cadena.split(" ");
        String part1 = parts[0];
        return part1;
    }

    @Override
    public String getLastname() {
        String cadena=this.adaptada.getFullname();
        String[] parts = cadena.split(" ");
        String part1 = parts[1];
        return part1;
    }

    @Override
    public void setName(String name) {
        this.adaptada.setFullname(name);
    }

    @Override
    public void setLastname(String lastname) {
        this.adaptada.setFullname(this.adaptada.getFullname() + lastname);   
    }

      
}
