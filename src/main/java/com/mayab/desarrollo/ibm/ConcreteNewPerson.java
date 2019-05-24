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
public class ConcreteNewPerson implements NewPerson {
    private String name;
    private String lastname;
    
    public ConcreteNewPerson(String name, String lastname){
        this.name=name;
        this.lastname=lastname;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLastname() {
        return this.lastname;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void setLastname(String lastname) {
        this.lastname=lastname;
    }
}
