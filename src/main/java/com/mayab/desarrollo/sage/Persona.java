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
public abstract class Persona implements Observer {
    public Bitacora bitacora;
    public Sendable messageBehaviour;
    
    public void setMessageBehaviour(Sendable s){
        this.messageBehaviour = s;
    }
    
    public abstract void sendMessage();

    /*@Override
    public void update() {
        alert();
    }
    
    public void alert(){
        Gasto gasto = this.bitacora.getGasto();
        System.out.println("\nNotificación de precio de compra excedido para " + this.nombre);
        System.out.println("Motivo de compra: " + gasto.motivo + "\n" + "Costo: " + gasto.costo);
        this.bitacora.logs.add(new Log(this.nombre, gasto));
    }*/
    
}
