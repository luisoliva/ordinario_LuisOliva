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
public class ConcreteOldPerson implements OldPerson {
    private String fullnmame;
    
    public ConcreteOldPerson(String fullname){
        this.fullnmame=fullname;
    }

    @Override
    public String getFullname() {
        return this.fullnmame;
    }

    @Override
    public void setFullname(String fullname) {
        this.fullnmame=fullname;
    }
}
