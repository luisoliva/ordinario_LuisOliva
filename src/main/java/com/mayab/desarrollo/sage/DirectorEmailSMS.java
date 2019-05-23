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
public class DirectorEmailSMS extends Persona implements Observer{
    public String nombre;
    
    public DirectorEmailSMS(String nombre){
        this.messageBehaviour = new AllMessage();
        this.nombre=nombre;
    }
    
    @Override
    public void sendMessage() {
        Gasto gasto = this.bitacora.getGasto();
        this.messageBehaviour.send(gasto, this.bitacora, this.nombre);
    }

    @Override
    public void update() {
        sendMessage();
    }
    
}
